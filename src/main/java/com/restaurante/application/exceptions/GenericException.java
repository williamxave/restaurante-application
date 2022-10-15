package com.restaurante.application.exceptions;

import lombok.Getter;
import org.springframework.http.HttpStatus;

@Getter
public abstract class GenericException extends Exception {

    protected HttpStatus status;
    protected String message;
    protected String title;

    public GenericException(HttpStatus status, String message, String title) {
        super(message);
        this.status = status;
        this.message = message;
        this.title = title;
    }

}
