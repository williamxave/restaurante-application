package com.restaurante.application.config.utils;

import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Getter
public class ErrorValidator extends DefaultError{

    List<FieldMessage> errors = new ArrayList<>();

    public ErrorValidator(int statusCode, long timeStamp) {
        super(statusCode, timeStamp);
    }

    public void addMessage(FieldMessage message){
        errors.add(message);
    }
}
