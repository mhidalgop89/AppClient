package com.bank.appclient.models.service;

import com.bank.appclient.models.entities.Persona;

import java.util.List;

public interface IPersona {

    public List<Persona> findAll();
    public Persona save(Persona persona);
    public Persona update(Persona persona);
    public void delete(Long id);
}
