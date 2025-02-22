package com.bank.appclient.models.service.impl;

import com.bank.appclient.models.dao.ClienteDao;
import com.bank.appclient.models.entities.Cliente;
import com.bank.appclient.models.service.ICliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteService implements ICliente {

    @Autowired
    private ClienteDao clienteDao;

    @Override
    public List<Cliente> findAll() {
        return clienteDao.findAll();
    }

    @Override
    public Cliente findClienteByIdentificacion(String identificacion) {
        return clienteDao.findClienteByIdentificacion(identificacion);
    }

    @Override
    public Cliente save(Cliente Cliente) {
        return clienteDao.save(Cliente);
    }

    @Override
    public Cliente update(Cliente cliente) {
        Cliente c = clienteDao.findById(cliente.getClienteid()).orElse(new Cliente());
        c.setPassword(cliente.getPassword());
        c.setEstado(cliente.getEstado());
        return clienteDao.save(c);
    }
    @Override
    public void delete(Long id) {
        clienteDao.deleteById(id);
    }
}
