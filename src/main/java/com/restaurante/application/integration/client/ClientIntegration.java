package com.restaurante.application.integration.client;

import com.restaurante.application.integration.client.entity.ClientEntity;
import com.restaurante.application.service.client.domain.ClientDomain;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;

@FeignClient(name = "clientRepository", url = "${feign.client.clientRepository.host}")
public interface ClientIntegration {

    @PostMapping(value = "${feign.client.clientRepository.insert}")
    ClientEntity insertClient(ClientDomain clientDomain);

}
