package com.restaurante.application.enums;

import org.springframework.http.HttpStatus;

public enum ErrorFieldEnum {


    SAVE_CLIENT_ERROR(HttpStatus.UNPROCESSABLE_ENTITY, "Erro ao salvar o cliente");

    public HttpStatus status;
    public String message;
    public String title;

    ErrorFieldEnum(HttpStatus status, String message) {
        this.status = status;
        this.message = message;
    }
}
