package com.restaurante.application.controller.dto;

import javax.validation.constraints.NotBlank;
import java.util.List;

public record ClientDTO(

        @NotBlank
        String name,
        @NotBlank
        String cpf,
        String email,
        List<String> phoneNumber
){
}
