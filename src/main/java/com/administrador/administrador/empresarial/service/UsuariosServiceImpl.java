package com.administrador.administrador.empresarial.service;

import com.administrador.administrador.empresarial.model.Usuarios;
import com.administrador.administrador.empresarial.repository.UsuariosRepositiry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuariosServiceImpl  implements UsuariosService {
    @Autowired
    private UsuariosRepositiry usuariosRepository;

    @Override
    public Usuarios saveUsuarios(Usuarios usuarios) {
        return usuariosRepository.save(usuarios);
    }

    //@Override
    //public List<Usuarios> getAllUsuarios() {
    //    return UsuariosRepositiry.();
    //}
}
