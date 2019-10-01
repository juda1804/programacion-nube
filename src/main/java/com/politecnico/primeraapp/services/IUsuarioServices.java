package com.politecnico.primeraapp.services;

import com.politecnico.primeraapp.domain.Usuario;

import java.util.List;

public interface IUsuarioServices {
    List<Usuario> listarUsuarios();
    Usuario agregarUsuario(Usuario usuario);
}
