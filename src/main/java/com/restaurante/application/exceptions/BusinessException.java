package com.restaurante.application.exceptions;

import lombok.Getter;
import lombok.Setter;
import org.springframework.http.HttpStatus;

@Getter
@Setter
public class BusinessException extends GenericException {

    public BusinessException(HttpStatus status, String message, String title) {
        super(status, message, title);
    }
}
