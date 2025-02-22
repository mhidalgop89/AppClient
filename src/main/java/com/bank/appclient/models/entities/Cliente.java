package com.bank.appclient.models.entities;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "cliente")
@Data
public class Cliente extends Persona{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long clienteid;
    private String password;
    private String estado;

}
