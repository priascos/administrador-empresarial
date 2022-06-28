package com.administrador.administrador.empresarial.service;

import com.administrador.administrador.empresarial.model.Usuarios;
import java.util.List;
import java.util.Optional;

public interface UsuariosService {
    public Usuarios saveUsuarios(Usuarios usuarios);
    //public List<Usuarios> findAll();
    //Optional<Usuarios> findByNombresAndContrasena(String nombre, String contrasena);
}
