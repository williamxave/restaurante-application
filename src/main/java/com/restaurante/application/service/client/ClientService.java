package com.restaurante.application.service.client;

import com.restaurante.application.integration.client.ClientIntegration;
import com.restaurante.application.integration.client.dto.ClientEntity;
import com.restaurante.application.service.client.dto.ClientDomain;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@RequiredArgsConstructor
public class ClientService {

    private ClientIntegration clientIntegration;

    public ClientEntity insertClient(ClientDomain clientDomain) {
        var teste = new ClientEntity(UUID.randomUUID().toString());

        return teste;
//        return clientIntegration.insertClient(clientDomain);
    }


}
