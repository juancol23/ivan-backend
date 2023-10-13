package com.example.runa.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;


@Entity
@Getter
@Setter
public class Usuario {
    @Id
    private String nombreUsuario;
    private String contraseña;
    private String perfil;
    private String email;
    private String status;

}
