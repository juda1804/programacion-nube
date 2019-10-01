package com.politecnico.primeraapp.dao;

import com.politecnico.primeraapp.domain.Usuario;

import java.util.List;


public interface IUsuarioDAO {
    List<Usuario> listarUsuarios();
    Usuario agregarUsuario(Usuario usuario);
}
