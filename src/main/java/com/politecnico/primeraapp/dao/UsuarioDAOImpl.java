package com.politecnico.primeraapp.dao;

import com.politecnico.primeraapp.data.UsuarioData;
import com.politecnico.primeraapp.domain.Usuario;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UsuarioDAOImpl implements IUsuarioDAO {
    @Override
    public List<Usuario> listarUsuarios() {
        return UsuarioData.getListaUsuarios();
    }

    @Override
    public Usuario agregarUsuario( Usuario usuario) {
        UsuarioData.getListaUsuarios().add(usuario);
        return usuario;
    }
}
