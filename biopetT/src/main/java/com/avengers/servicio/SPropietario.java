package com.avengers.servicio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.avengers.entidad.EPropietario;
import com.avengers.repositorio.RPropietario;

@Service("serviciopropietario")
public class SPropietario {
	@Autowired
	@Qualifier("repositoriopropietario")
	private RPropietario repositoriopropieatrio ;
	
	public boolean ingresarPropietario (EPropietario p) {
		try {
			repositoriopropieatrio.save(p);
			return true;
		}catch (Exception e){
			return false;
		}
		
	}
	
	public boolean borrarPropietario (String r) {
		try {
			EPropietario aux= repositoriopropieatrio.findByrut(r);
			repositoriopropieatrio.delete(aux);
			return true;
		}catch (Exception e) {
			return false;
		}
	}
}
