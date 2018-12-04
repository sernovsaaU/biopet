package com.avengers.model;

import java.sql.Date;
import java.time.LocalDate;
import com.avengers.entidad.EPaciente;

public class MPaciente {
	private int idPaciente;
	private String nombre;
	private java.util.Date fecha;
	private String especie;
	private String raza;
	private String sexo;
	private String pelaje;
	private String microchip;
	private String alergias;
	private String esterelizado;
	
	
	/*El date debe corregirse, investigar el formato tanto de entrada y para la persistencia, impacta asus metdos y al constructor*/
	/*constructores*/
	public MPaciente() {
	}
	public MPaciente(EPaciente ep) {
		this.idPaciente = ep.getId();
		this.nombre = ep.getNombre();
		this.fecha = ep.getFechaNac();
		this.especie = ep.getEspecie();
		this.raza=ep.getRaza();
		this.sexo = ep.getSexo();
		this.pelaje = ep.getPelaje();
		this.microchip = ep.getMicrochip();
		this.alergias = ep.getAlergias();
		this.esterelizado = ep.getEspecie();
	}
	public MPaciente(int idPaciente, String nombre, java.util.Date fecha, String especie,String raza, String sexo, String pelaje,
			String microchip, String alergias, String esterelizado) {
		this.idPaciente = idPaciente;
		this.nombre = nombre;
		this.fecha = fecha;
		this.especie = especie;
		this.raza=raza;
		this.sexo = sexo;
		this.pelaje = pelaje;
		this.microchip = microchip;
		this.alergias = alergias;
		this.esterelizado = esterelizado;
	}


	public int getIdPaciente() {
		return idPaciente;
	}

	
	public String getNombre() {
		return nombre;
	}
	
	
	
	public java.util.Date getFecha() {
		return fecha;
	}

	
	
	public String getEspecie() {
		return especie;
	}

	
	
	public String getRaza() {
		return raza;
	}

	
	public String getSexo() {
		return sexo;
	}

	
	
	public String getPelaje() {
		return pelaje;
	}
	

	
	public String getMicrochip() {
		return microchip;
	}
	public void setMicrochip(String microchip) {
		this.microchip = microchip;
	}
	
	
	public String getAlergias() {
		return alergias;
	}
	public void setAlergias(String alergias) {
		this.alergias = alergias;
	}
	
	
	public String getEsterelizado() {
		return esterelizado;
	}
	public void setEsterelizado(String esterelizado) {
		this.esterelizado = esterelizado;
	}
	
	
}
