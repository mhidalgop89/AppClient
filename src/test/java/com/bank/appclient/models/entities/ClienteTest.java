package com.bank.appclient.models.entities;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ClienteTest {

    private final Cliente cliente = new Cliente();

    @Test
    void creationOfClienteObject(){
       cliente.setEstado("1");
       cliente.setNombre("Mario");
       Assertions.assertNotNull(cliente);
       Assertions.assertEquals("Mario", cliente.getNombre());
    }
}
