package com.gjdev.platform.idgenerators;

import com.gjdev.platform.persistance.base.etdt.BaseEntity;
import org.hibernate.HibernateException;
import org.hibernate.engine.spi.SharedSessionContractImplementor;
import org.hibernate.generator.BeforeExecutionGenerator;
import org.hibernate.generator.EventType;
import org.hibernate.generator.EventTypeSets;

import java.util.EnumSet;

public class IdeGeneratorWrapper implements BeforeExecutionGenerator {

    @Override
    public EnumSet<EventType> getEventTypes() {
        return EventTypeSets.INSERT_ONLY;
    }

    @Override
    public Object generate(
            SharedSessionContractImplementor session,
            Object owner,
            Object currentValue,
            EventType eventType) {
        if (owner == null) {
            throw new HibernateException(new NullPointerException("Entity cannot be null"));
        }
        BaseEntity entity = (BaseEntity) owner;
        if (entity.getId() != null) {
            return entity.getId();
        }
        return SnowFlakeIDGenerator.getInstance().nextId();
    }
}
