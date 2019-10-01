package com.politecnico.primeraapp.dao;

import com.politecnico.primeraapp.domain.UsuarioEntity;

import java.util.List;


public interface IUsuarioDAO {
    List<UsuarioEntity> listarUsuarios();
}
