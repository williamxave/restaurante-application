package com.restaurante.application.integration.client;

import com.restaurante.application.integration.client.dto.ClientEntity;
import com.restaurante.application.service.client.dto.ClientDomain;
import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(name = "clientRepository", url = "${feign.client.clientRepository.host}")
public interface ClientIntegration {

    ClientEntity insertClient(ClientDomain clientDomain);

}
