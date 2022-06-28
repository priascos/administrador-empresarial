package com.administrador.administrador.empresarial.model;

import org.hibernate.mapping.List;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Usuarios {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nombre;
    private String contrasena;

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(
            name = "usuarios_empresas",
            joinColumns = @JoinColumn(name="usuarios_id"),
            inverseJoinColumns =  @JoinColumn(name = "empresas_id")
    )
    private Set<Empresas> usuariosEmpresas;

    public Usuarios(){

    }

    public Usuarios(String nombre, String contrasena) {
        this.nombre = nombre;
        this.contrasena = contrasena;
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

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }
}
