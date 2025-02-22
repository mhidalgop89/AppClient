package com.bank.appclient.models.dao;

import com.bank.appclient.models.entities.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteDao extends JpaRepository<Cliente, Long> {
    public Cliente findClienteByIdentificacion(String identificacion);
}
