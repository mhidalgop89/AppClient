package com.bank.appclient.models.service;

import com.bank.appclient.models.entities.Cliente;

import java.util.List;

public interface ICliente {
    public List<Cliente> findAll();
    public Cliente findClienteByIdentificacion(String identificacion);
    public Cliente save(Cliente Cliente);
    public Cliente update(Cliente cliente);
    public void delete(Long id);
}
