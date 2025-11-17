package com.gjdev.platform.persistance.base.etdt;

import com.gjdev.platform.idgenerators.CustomID;
import jakarta.persistence.Column;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.util.Date;

@MappedSuperclass
public class BaseEntity {

    @CustomID
    @Id
    @Column(name = "ID", nullable = false, updatable = false, unique = true, length = 36)

    protected Long id;
    @Column(name = "ENTITY_STATUS")
    protected Integer entityStatus = 0;

    @Column(name = "CHANGED_ON")
    @UpdateTimestamp
    protected Date changedOn;

    @Column(name = "CREATED_ON")
    @CreationTimestamp

    protected Date createdOn;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getEntityStatus() {
        return entityStatus;
    }

    public void setEntityStatus(Integer entityStatus) {
        this.entityStatus = entityStatus;
    }

    public Date getChangedOn() {
        return changedOn;
    }

    public void setChangedOn(Date changedOn) {
        this.changedOn = changedOn;
    }

    public Date getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(Date createdOn) {
        createdOn = createdOn;
    }
}