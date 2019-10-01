package com.politecnico.primeraapp.controller;


import com.politecnico.primeraapp.domain.Usuario;
import com.politecnico.primeraapp.services.IUsuarioServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UsuarioController {
    @Autowired
    private IUsuarioServices usuarioServices;

    @GetMapping("/usuarios")
    public List<Usuario> listarUsuarios() {
       return usuarioServices.listarUsuarios();
    }

    @PostMapping("/usuarios")
    public Usuario agregarUsuario(@RequestBody Usuario usuario) {
        return usuarioServices.agregarUsuario(usuario);
    }
}
