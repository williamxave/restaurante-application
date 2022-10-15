package com.restaurante.application.service.client;

import com.restaurante.application.exceptions.BusinessException;
import com.restaurante.application.integration.client.ClientIntegration;
import com.restaurante.application.integration.client.entity.ClientEntity;
import com.restaurante.application.service.client.domain.ClientDomain;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ClientService {

    private final ClientIntegration integration;

    public ClientEntity insertClient(ClientDomain clientDomain) throws BusinessException {
        return integration.insertClient(clientDomain);
    }
}
