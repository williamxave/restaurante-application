package com.restaurante.application.integration.client.client;

import com.restaurante.application.integration.client.entity.ClientEntity;
import com.restaurante.application.service.client.domain.ClientDomain;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;

@FeignClient(name = "clientInterface", url = "${feign.client.clientInterface.host}")
public interface ClientInterfaceIntegration {

    @PostMapping(value = "${feign.client.clientInterface.insert}")
    ClientEntity insertClient(ClientDomain clientDomain);

}
