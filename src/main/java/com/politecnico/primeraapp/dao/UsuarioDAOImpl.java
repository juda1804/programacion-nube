package com.politecnico.primeraapp.dao;

import com.politecnico.primeraapp.data.UsuarioData;
import com.politecnico.primeraapp.domain.UsuarioEntity;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UsuarioDAOImpl implements IUsuarioDAO {
    @Override
    public List<UsuarioEntity> listarUsuarios() {
        return UsuarioData.getListaUsuarios();
    }
}
