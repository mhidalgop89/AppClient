package com.bank.appclient.models.service.impl;

import com.bank.appclient.models.dao.PersonaDao;
import com.bank.appclient.models.entities.Persona;
import com.bank.appclient.models.service.IPersona;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonaService /*implements IPersona */{

    /*@Autowired
    private PersonaDao personaDao;

    @Override
    public List<Persona> findAll() {
        return personaDao.findAll();
    }

    @Override
    public Persona save(Persona persona){
        return personaDao.save(persona);
    }
    @Override
    public  Persona update(Persona persona){
        Persona p = personaDao.findById(persona.getId()).orElse(new Persona());
        p.setDireccion(persona.getDireccion());
        p.setEdad(persona.getEdad());
        p.setGenero(persona.getGenero());
        p.setNombre(persona.getNombre());
        p.setTelefono(persona.getTelefono());
        p.setIdentificacion(persona.getIdentificacion());
        return personaDao.save(p);
    }
    @Override
    public void delete(Long id){
        personaDao.deleteById(id);
    }*/

}
