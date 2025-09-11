package com.fellp.commerce.dto;

public class FieldMessage {
    private String fieldName;
    private String msg;

    public FieldMessage(String fieldName, String msg) {
        this.fieldName = fieldName;
        this.msg = msg;
    }

    public String getFieldName() {
        return fieldName;
    }

    public String getMsg() {
        return msg;
    }
}
