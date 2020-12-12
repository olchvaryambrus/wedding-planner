package com.szoftlab.weddingplanner.model;

import com.fasterxml.jackson.annotation.JsonValue;

public enum TaskTypeEnum {
    DEFAULT("Alapértelemezett", 0),
    DATE("Dátum", 1),
    LOCATION("helyszín", 2);


    private final String name;

    @JsonValue
    private final int code;

    private TaskTypeEnum(String name, Integer code) {
        this.name = name;
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public Integer getCode() { return code; }
}
