package com.politecnico.primeraapp.controller;


import com.politecnico.primeraapp.domain.UsuarioEntity;
import com.politecnico.primeraapp.services.IUsuarioServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UsuarioController {
    @Autowired
    private IUsuarioServices usuarioServices;

    @GetMapping("/usuarios")
    public List<UsuarioEntity> listarUsuarios() {
       return usuarioServices.listarUsuarios();
    }
}
