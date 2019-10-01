package com.politecnico.primeraapp.services;

import com.politecnico.primeraapp.domain.UsuarioEntity;

import java.util.List;

public interface IUsuarioServices {
    List<UsuarioEntity> listarUsuarios();
}
