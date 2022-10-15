package com.restaurante.application.config;

import com.restaurante.application.config.utils.Content;
import com.restaurante.application.config.utils.DefaultError;
import com.restaurante.application.config.utils.ErrorValidator;
import com.restaurante.application.config.utils.FieldMessage;
import com.restaurante.application.exceptions.BusinessException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import static java.lang.System.currentTimeMillis;

@RestControllerAdvice
public class GlobalHandlerException {

    @ExceptionHandler(BusinessException.class)
    public ResponseEntity<Content<DefaultError>> businessExceptionValidator(BusinessException ex) {
        ErrorValidator error = new ErrorValidator(ex.getStatus().value(), currentTimeMillis());
        FieldMessage messages = new FieldMessage(ex.getTitle(),ex.getMessage());
        error.addMessage(messages);
        return ResponseEntity.status(ex.getStatus().value()).body(new Content<>(error));
    }
}
