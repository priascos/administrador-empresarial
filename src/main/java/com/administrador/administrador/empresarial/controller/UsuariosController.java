package com.administrador.administrador.empresarial.controller;

import com.administrador.administrador.empresarial.model.Usuarios;
import com.administrador.administrador.empresarial.service.UsuariosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/usuarios")
@CrossOrigin
public class UsuariosController {
    @Autowired
    private UsuariosService usuariosService;

    @PostMapping("add")
    public String add(@RequestBody Usuarios usuarios){
        usuariosService.saveUsuarios(usuarios);
        return "nuevo ingreso";
    }

}
