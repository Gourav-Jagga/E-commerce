package com.gjdev.platform.persistance.base.etdt;

import java.io.Serializable;
import java.util.Date;

/**
 * DTO for {@link BaseEntity}
 */
public class BaseEntityDto implements Serializable {
    private static final long serialVersionUID = 4126015811228425746L;
    private Long id;
    private Integer entityStatus = 0;
    private Date changedOn;
    private Date createdOn;

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
        this.createdOn = createdOn;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "(" +
                "id = " + id + ", " +
                "entityStatus = " + entityStatus + ", " +
                "changedOn = " + changedOn + ", " +
                "createdOn = " + createdOn + ")";
    }
}