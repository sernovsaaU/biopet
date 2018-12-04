package com.avengers.model;

import java.sql.Date;
import java.time.LocalDate;
import com.avengers.entidad.EAtencion;

public class MAtencion {
	private Date fechaConsulta;
	private String descripcion;
	/*falta un date de hora*/
	
	//constructores
	public MAtencion() {
	}
	public MAtencion (EAtencion ea) {
		this.fechaConsulta = ea.getFechaConsulta();
		this.descripcion = ea.getDescripcion();
	}
	public MAtencion(Date fechaConsulta, String descripcion) {
		this.fechaConsulta = fechaConsulta;
		this.descripcion = descripcion;
	}
	
	
	//getter y setter
	public Date getFechaConsulta() {
		return fechaConsulta;
	}
	
	
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

}
