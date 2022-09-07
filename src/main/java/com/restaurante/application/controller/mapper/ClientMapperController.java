package com.restaurante.application.controller.mapper;


import com.restaurante.application.controller.dto.ClientDTO;
import com.restaurante.application.service.client.domain.ClientDomain;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ClientMapperController {

    ClientDomain toDomain(ClientDTO clientDTO);


}
