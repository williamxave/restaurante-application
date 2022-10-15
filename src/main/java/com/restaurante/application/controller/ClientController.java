package com.restaurante.application.controller;


import com.restaurante.application.controller.dto.ClientDTO;
import com.restaurante.application.controller.mapper.ClientMapperController;
import com.restaurante.application.exceptions.BusinessException;
import com.restaurante.application.service.client.ClientService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import javax.validation.Valid;
import java.net.URI;

@RestController
@RequestMapping("client")
@RequiredArgsConstructor
public class ClientController {

    private final ClientService clientService;

    private final ClientMapperController clientMapperController;

    @PostMapping("/insert")
    public ResponseEntity<?> insertClient(@RequestBody @Valid ClientDTO request) throws BusinessException {
        var requestDomain = clientMapperController.toDomain(request);
        var response = clientService.insertClient(requestDomain);

        URI uri = UriComponentsBuilder.fromUriString("{externalId}").buildAndExpand(response.externalId()).toUri();

        return ResponseEntity.created(uri).build();
    }
}