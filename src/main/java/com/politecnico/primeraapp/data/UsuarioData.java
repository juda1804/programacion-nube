package com.politecnico.primeraapp.data;

import com.politecnico.primeraapp.domain.UsuarioEntity;

import java.util.ArrayList;
import java.util.List;

public class UsuarioData {


    private static List<UsuarioEntity> listaUsuarios;

    static {
       listaUsuarios = new ArrayList<UsuarioEntity>(){
           {
               add(new UsuarioEntity("1","Juan","Cadavid",true));
               add(new UsuarioEntity("2","Alfonso","Cuastumal",true));
               add(new UsuarioEntity("3","Fabian","Arango",true));
           }
       };
    }

    public static List<UsuarioEntity> getListaUsuarios() {
        return listaUsuarios;
    }

    public static void setListaUsuarios(List<UsuarioEntity> listaUsuarios) {
        UsuarioData.listaUsuarios = listaUsuarios;
    }
}
