package com.avengers.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.avengers.entidad.EPropietario;
import java.io.Serializable;


@Repository("repositoriopropietario")
public interface RPropietario extends JpaRepository<EPropietario,Serializable>{
	public EPropietario findByrut(String rut);
}
