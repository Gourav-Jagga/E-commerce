package com.gjdev.db;

import com.gjdev.platform.persistance.base.etdt.ENTITY_STATUS;
import com.gjdev.platform.persistance.secutirymgmt.etdt.EntityDef;
import com.gjdev.platform.persistance.secutirymgmt.etdt.FieldDef;
import com.gjdev.platform.persistance.secutirymgmt.repo.EntityDefRepository;
import com.gjdev.platform.persistance.secutirymgmt.repo.FieldDefRepository;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.metamodel.Attribute;
import jakarta.persistence.metamodel.EntityType;
import jakarta.persistence.metamodel.Metamodel;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.autoconfigure.condition.ConditionOutcome;
import org.springframework.boot.autoconfigure.condition.SpringBootCondition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.context.annotation.Conditional;
import org.springframework.core.type.AnnotatedTypeMetadata;
import org.springframework.stereotype.Component;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

@Component
@Conditional(OnMetadataModeNotNoneCondition.class)
public class MetaDataLoaderRunner implements CommandLineRunner {

    private final EntityManagerFactory emf;
    private final EntityDefRepository entityDefRepository;
    private final FieldDefRepository fieldDefRepository;
    private final MetadataMode mode;

    public MetaDataLoaderRunner(EntityManagerFactory emf,
                                EntityDefRepository entityDefRepository,
                                FieldDefRepository fieldDefRepository,
                                @Value("${app.metadata.mode:INSERT}") String modeStr) {
        this.emf = emf;
        this.entityDefRepository = entityDefRepository;
        this.fieldDefRepository = fieldDefRepository;
        try {
            this.mode = MetadataMode.valueOf(modeStr.toUpperCase());
        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException("Invalid metadata mode: " + modeStr, e);
        }
    }

    @Transactional
    public void loadEntityMetadata() {
        Metamodel metamodel = emf.getMetamodel();
        Set<EntityType<?>> currentEntities = metamodel.getEntities();
        Set<String> currentEntityNames = currentEntities.stream()
                .map(EntityType::getName)
                .collect(Collectors.toSet());

        Map<String, EntityDef> existingEntityDefs = entityDefRepository.findAll().stream()
                .collect(Collectors.toMap(EntityDef::getEntityName, Function.identity()));

        Set<EntityDef> entitiesToSave = new HashSet<>();
        Set<FieldDef> fieldsToSave = new HashSet<>();
        Set<FieldDef> fieldsToDelete = new HashSet<>();


        for (EntityType<?> entityType : currentEntities) {
            String entityName = entityType.getName();
            String tableName = entityType.getJavaType().getSimpleName();

            EntityDef entityDef = existingEntityDefs.remove(entityName);

            if (entityDef == null) {
                entityDef = new EntityDef();
                entityDef.setEntityName(entityName);
                entityDef.setTableName(tableName);
                entityDef.setEntityStatus(ENTITY_STATUS.ACTIVE.get());
                entitiesToSave.add(entityDef);
            } else {
                if (entityDef.getEntityStatus() != ENTITY_STATUS.ACTIVE.get()) {
                    entityDef.setEntityStatus(ENTITY_STATUS.ACTIVE.get());
                    entitiesToSave.add(entityDef);
                }
            }

            Map<String, FieldDef> existingFieldDefs = entityDef.getFieldDefs().stream()
                    .collect(Collectors.toMap(FieldDef::getFieldName, Function.identity()));

            for (Attribute<?, ?> attr : entityType.getAttributes()) {
                String fieldName = attr.getName();

                FieldDef fieldDef = existingFieldDefs.remove(fieldName);

                if (fieldDef == null) {
                    fieldDef = new FieldDef();
                    fieldDef.setFieldName(fieldName);
                    fieldDef.setDataType(attr.getJavaType().getSimpleName());
                    fieldDef.setColumnName(fieldName.toUpperCase());
                    fieldDef.setEntityDef(entityDef);
                    fieldsToSave.add(fieldDef);
                }
            }

            if (mode == MetadataMode.UPDATE) {
                fieldsToDelete.addAll(existingFieldDefs.values());
            }

            if (!fieldsToSave.isEmpty()) {
                entitiesToSave.add(entityDef);
            }
        }

        if (mode == MetadataMode.UPDATE) {
            entitiesToSave.addAll(existingEntityDefs.values().stream().map(
                    item -> {
                        if (item.getEntityStatus() != ENTITY_STATUS.DELETED.get()) {
                            item.setEntityStatus(ENTITY_STATUS.DELETED.get());
                        }
                        return item;
                    }).toList());

            fieldsToSave.addAll(fieldsToDelete.stream().map(
                    item -> {
                        if (item.getEntityStatus() != ENTITY_STATUS.DELETED.get()) {
                            item.setEntityStatus(ENTITY_STATUS.DELETED.get());
                        }
                        return item;
                    }).toList());
        }

        switch (mode) {
            case INSERT, UPDATE:
                entityDefRepository.saveAll(entitiesToSave);
                fieldDefRepository.saveAll(fieldsToSave);
                break;

            case VALIDATE:
                if (!entitiesToSave.isEmpty() || !fieldsToSave.isEmpty()) {
                    String entityReport = entitiesToSave.stream()
                            .filter(e -> !currentEntityNames.contains(e.getEntityName()))
                            .map(EntityDef::getEntityName)
                            .collect(Collectors.joining(", "));
                    String fieldReport = fieldsToSave.stream()
                            .map(FieldDef::getFieldName)
                            .collect(Collectors.joining(", "));

                    String message = "MetaData validation failed: ";
                    if (!entityReport.isEmpty()) {
                        message += "New/Deleted Entities: [" + entityReport + "]. ";
                    }
                    if (!fieldReport.isEmpty()) {
                        message += "New Fields: [" + fieldReport + "].";
                    }
                    throw new RuntimeException(message);
                }
                break;
        }

        System.out.println("Entity and Field metadata processed successfully. Mode: " + mode);
    }

    @Override
    public void run(String... args) {
        loadEntityMetadata();
    }

    public enum MetadataMode {INSERT, UPDATE, VALIDATE, NONE}
}

class OnMetadataModeNotNoneCondition extends SpringBootCondition {

    @Override
    public ConditionOutcome getMatchOutcome(ConditionContext context, AnnotatedTypeMetadata metadata) {
        String mode = context.getEnvironment().getProperty("app.metadata.mode", "NONE");
        boolean shouldLoad = !"NONE".equalsIgnoreCase(mode);

        if (shouldLoad) {
            return ConditionOutcome.match("Metadata mode is active (" + mode + ")");
        } else {
            return ConditionOutcome.noMatch("Metadata mode is NONE — skipping MetaDataLoaderRunner initialization");
        }
    }
}