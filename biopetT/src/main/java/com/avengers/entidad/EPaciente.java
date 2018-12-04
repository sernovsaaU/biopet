package com.avengers.entidad;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;
@Entity
@Table(name="paciente") 	
public class EPaciente implements Serializable{
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@ManyToOne
	@JoinColumn(name = "rut")
	private EPropietario propietario;
	
	@Column(name = "nombre")
	private String nombre;
	
	@Column(name = "raza")
	private String raza;
	
	@Column(name = "especie")
	private String especie;
	
	@Column(name = "fechaNac")
	@DateTimeFormat(pattern = "yyyy/MM/dd")
	private Date fechaNac;
	
	@Column(name = "sexo")
	private String sexo;
	
	@Column(name = "esterilizado")
	private String esterilizado;
	
	@Column(name = "pelaje")
	private String pelaje;
	
	@Column(name = "microchip")
	private String microchip;
	
	@Column(name = "alergias")
	private String alergias;
	
/* --objetos de relaciones--
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name = "rut_propietario",insertable=false, updatable=false )
	private Propietario propietario;
	@ManyToOne
	@JoinColumn(name = "rut_veterinario")
	private Veterinario veterinario;
*/
	public EPaciente() {
		super();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}	
	public String getRaza() {
		return raza;
	}
	public void setRaza(String raza) {
		this.raza = raza;
	}
	public String getEspecie() {
		return especie;
	}
	public void setEspecie(String especie) {
		this.especie = especie;
	}
	public Date getFechaNac() {
		return fechaNac;
	}
	public void setFechaNac(Date fechaNac) {
		this.fechaNac = fechaNac;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public String getEsterilizado() {
		return esterilizado;
	}	
	public void setEsterilizado(String esterilizado) {
		this.esterilizado = esterilizado;
	}
	public String getPelaje() {
		return pelaje;
	}
	public void setPelaje(String pelaje) {
		this.pelaje = pelaje;
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
	private static final long serialVersionUID = 1L;

}

