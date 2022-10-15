package com.restaurante.application.config.utils;

import lombok.Getter;

@Getter
public class Content<T> {

    private T content;

    public Content(T content) {
        this.content = content;
    }

    public Content() {
    }
}
