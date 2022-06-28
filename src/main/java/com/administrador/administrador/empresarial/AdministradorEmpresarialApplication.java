package com.administrador.administrador.empresarial;

import com.administrador.administrador.empresarial.model.Usuarios;
import com.administrador.administrador.empresarial.repository.UsuariosRepositiry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AdministradorEmpresarialApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(AdministradorEmpresarialApplication.class, args);
	}

	@Autowired
	private UsuariosRepositiry usuariosRepositiry;


	@Override
	public void run(String... args) throws Exception {
		//this.usuariosRepositiry.save(new Usuarios("nombre1","123456"));
		//this.usuariosRepositiry.save(new Usuarios("nombre2","123456"));
		//this.usuariosRepositiry.save(new Usuarios("nombre3","123456"));
	}
}
