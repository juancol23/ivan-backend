package com.example.runa.controller;

import com.example.runa.model.Usuario;
import com.example.runa.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UsuarioController {
    @Autowired
    private UsuarioRepository usuarioRepository;

    @PostMapping("/user")
    public Usuario guardarUsuario(@RequestBody Usuario usuario) {
        usuarioRepository.save(usuario);
        return usuario;
    }
}
