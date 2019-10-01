package com.politecnico.primeraapp.data;

import com.politecnico.primeraapp.domain.Usuario;

import java.util.ArrayList;
import java.util.List;

public class UsuarioData {


    private static List<Usuario> listaUsuarios;

    static {
       listaUsuarios = new ArrayList<Usuario>(){
           {
               add(new Usuario("1","Juan","Cadavid",true));
               add(new Usuario("2","Alfonso","Cuastumal",true));
               add(new Usuario("3","Fabian","Arango",true));
           }
       };
    }

    public static List<Usuario> getListaUsuarios() {
        return listaUsuarios;
    }

    public static void setListaUsuarios(List<Usuario> listaUsuarios) {
        UsuarioData.listaUsuarios = listaUsuarios;
    }
}
