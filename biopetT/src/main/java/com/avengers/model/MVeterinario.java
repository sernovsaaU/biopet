package com.avengers.model;

import com.avengers.entidad.EVeterinario;

public class MVeterinario {
	private String rut;
	private String nombre;
	private String direccion;
	private String especialidad;
	private String telefono;
	
	//Getter y setter
	public MVeterinario() {
	}
	public MVeterinario(String rut, String nombre, String direccion, String especialidad, String telefono) {
		super();
		this.rut = rut;
		this.nombre = nombre;
		this.direccion = direccion;
		this.especialidad = especialidad;
		this.telefono = telefono;
	}
	
	//Getter y setter
	public String getRut() {
		return rut;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	
	public String getEspecialidad() {
		return especialidad;
	}
	
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	
	
	

}
