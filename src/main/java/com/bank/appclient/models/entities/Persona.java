package com.bank.appclient.models.entities;

import jakarta.persistence.*;
import lombok.Data;

//@Entity
//@Table(name = "cliente")
@Data
@MappedSuperclass
public class Persona {

    //@Id
    //@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Transient
    private Long id;
    private String nombre;
    private String genero;
    private Integer edad;
    private String identificacion;
    private String direccion;
    private String telefono;

}
