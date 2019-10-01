package com.politecnico.primeraapp.services;

import com.politecnico.primeraapp.dao.IUsuarioDAO;
import com.politecnico.primeraapp.domain.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioServicesImpl implements IUsuarioServices {

    @Autowired
    private IUsuarioDAO usuarioDAO;

    @Override
    public List<Usuario> listarUsuarios() {
        return usuarioDAO.listarUsuarios();
    }

    public Usuario agregarUsuario(Usuario usuario) {
        if(!usuarioDAO.listarUsuarios().contains(usuario)) {
            usuarioDAO.agregarUsuario(usuario);
        }
        return usuario;
    }
}
