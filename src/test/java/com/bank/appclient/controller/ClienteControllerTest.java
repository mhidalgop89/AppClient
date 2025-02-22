package com.bank.appclient.controller;

import com.bank.appclient.models.entities.Cliente;
import com.bank.appclient.models.service.ICliente;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;


@ExtendWith(MockitoExtension.class)
public class ClienteControllerTest {

    @Mock
    private ICliente clienteService;

    @InjectMocks
    private ClienteController controller;

    @Test
    void findAllClients(){
        when(clienteService.findAll()).thenReturn(new ArrayList<>());
        ResponseEntity<List<Cliente>> result = controller.findAll();
        Assertions.assertNotNull(result.getBody());
        Assertions.assertEquals(result.getStatusCode().value(), HttpStatus.OK.value());
    }

    @Test
    void findClientsByIdent(){
        when(clienteService.findClienteByIdentificacion(any())).thenReturn(new Cliente());
        ResponseEntity<Cliente> result = controller.findClienteByIdentificacion("0921111111");
        Assertions.assertNotNull(result.getBody());
        Assertions.assertEquals(result.getStatusCode().value(), HttpStatus.OK.value());
    }
}
