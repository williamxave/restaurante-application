package com.restaurante.application.integration.client;

import com.restaurante.application.exceptions.BusinessException;
import com.restaurante.application.integration.client.client.ClientInterfaceIntegration;
import com.restaurante.application.integration.client.entity.ClientEntity;
import com.restaurante.application.service.client.domain.ClientDomain;
import feign.FeignException;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import static com.restaurante.application.enums.ErrorFieldEnum.SAVE_CLIENT_ERROR;

@Repository
@RequiredArgsConstructor
public class ClientIntegration {
    private static final Logger LOG = LoggerFactory.getLogger(ClientIntegration.class);

    private final ClientInterfaceIntegration integration;

    public ClientEntity insertClient(ClientDomain clientDomain) throws BusinessException {
        try {
            LOG.info("Inciando a chamada para api do repository / ClientIntegration.insertClient / Salvando um(a) cliente novo(a) --> " + clientDomain.email());
            return integration.insertClient(clientDomain);
        } catch (FeignException.FeignClientException ex) {
            LOG.error("Erro 4xx ao salvar um novo cliente / ClientIntegration.insertClient ", ex);
            throw new BusinessException(
                    SAVE_CLIENT_ERROR.status,
                    SAVE_CLIENT_ERROR.message,
                    SAVE_CLIENT_ERROR.name());
        } catch (FeignException.FeignServerException ex) {
            LOG.error("Erro 5xx ao salvar um novo cliente / ClientIntegration.insertClient ", ex);
            throw new BusinessException(
                    SAVE_CLIENT_ERROR.status,
                    SAVE_CLIENT_ERROR.message,
                    SAVE_CLIENT_ERROR.name());
        }
    }
}