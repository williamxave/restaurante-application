package com.restaurante.application.config.utils;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class DefaultError {

    private int statusCode;
    private long timeStamp;

}
