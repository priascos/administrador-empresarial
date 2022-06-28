package com.administrador.administrador.empresarial.repository;

import com.administrador.administrador.empresarial.model.Usuarios;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Repository
public interface UsuariosRepositiry  extends JpaRepository<Usuarios,Integer> {
    //@Transactional(readOnly = true)
    //Optional<Usuarios> findByNombresAndContrasena(String nombre, String contrasena);
}
