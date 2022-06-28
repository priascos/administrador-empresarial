package com.administrador.administrador.empresarial.model;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Empresas {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nombre;
    private String descripcion;

    @ManyToMany(mappedBy = "usuariosEmpresas",
            fetch = FetchType.LAZY)
    private Set<Usuarios> usuarios;

    public Empresas(){

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
