package com.avengers.model;
import com.avengers.entidad.EPropietario;

public class MPropietario {
	private String rut;
	private String direccion;
	private String nombre;
	private String telefono;
	private String email;
	
	// constructores
	public MPropietario() {
	}
	public MPropietario(EPropietario epr) {
		this.rut = epr.getRut();
		this.direccion = epr.getDireccion();
		this.nombre = epr.getNombre();
		this.telefono = epr.getTelefono();
		this.email = epr.getEmail();
	}
	public MPropietario(String rut, String direccion, String nombre, String telefono, String email) {
		this.rut = rut;
		this.direccion = direccion;
		this.nombre = nombre;
		this.telefono = telefono;
		this.email = email;
	}

	// Getter y setter
	public String getRut() {
		return rut;
	}
	
	
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	
	
	public String getNombre() {
		return nombre;
	}
	
	
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	

}
