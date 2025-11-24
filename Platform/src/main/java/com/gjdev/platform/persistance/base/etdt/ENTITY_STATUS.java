package com.gjdev.platform.persistance.base.etdt;

public enum ENTITY_STATUS {
    ACTIVE(0),
    INACTIVE(9),
    DELETED(3);
    int entityStatus;
    ENTITY_STATUS(int entityStatus){
        this.entityStatus = entityStatus;
    }
    public int get(){
        return entityStatus;
    }
}
