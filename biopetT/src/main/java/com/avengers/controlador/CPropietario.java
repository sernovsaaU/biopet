package com.avengers.controlador;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.avengers.entidad.EPropietario;
import com.avengers.servicio.SPropietario;

@RestController 

@RequestMapping(value = "/avengers")
public class CPropietario {
	@Autowired
	@Qualifier("serviciopropietario")
	SPropietario php;
	
	@PutMapping(value="/propietario")
	public boolean insertarPropietario (@RequestBody @Valid EPropietario p) {
		return php.ingresarPropietario(p);
	}
}
