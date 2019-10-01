package com.politecnico.primeraapp.domain;


import lombok.Getter;
import lombok.Setter;
import java.util.Objects;

public class UsuarioEntity {


    @Getter
    @Setter
    private String cedula;


    @Getter
    @Setter
    private String nombres;


    @Getter
    @Setter
    private String apellidos;


    @Getter
    @Setter
    private boolean estado;

    public UsuarioEntity() {
    }

    public UsuarioEntity(String cedula, String nombres, String apellidos, boolean estado) {
        this.cedula = cedula;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.estado = estado;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UsuarioEntity that = (UsuarioEntity) o;
        return Objects.equals(cedula, that.cedula);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cedula);
    }
}
