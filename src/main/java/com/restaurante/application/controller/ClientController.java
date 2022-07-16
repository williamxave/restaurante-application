package com.restaurante.application.controller;


import com.restaurante.application.controller.dto.ClientDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("client")
public class ClientController {

    @PostMapping("/insert")
    public ResponseEntity<?> insertClient(@RequestBody @Valid ClientDTO clientDTO) {


        return ResponseEntity.noContent().build();
    }

}
