package com.mycompany.CollectionsTask.model;

public enum SweetnessType {
    CANDY("candy"), MARSHMALLOW("marshmallow");
    
    private String type;

    private SweetnessType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }
}
