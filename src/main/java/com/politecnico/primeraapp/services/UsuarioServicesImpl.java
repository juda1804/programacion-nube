package com.politecnico.primeraapp.services;

import com.politecnico.primeraapp.dao.IUsuarioDAO;
import com.politecnico.primeraapp.domain.UsuarioEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioServicesImpl implements IUsuarioServices {

    @Autowired
    private IUsuarioDAO usuarioDAO;

    @Override
    public List<UsuarioEntity> listarUsuarios() {
        return usuarioDAO.listarUsuarios();
    }
}
