package com.avengers.entidad;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="fichaclinica")
public class EFichaClinica implements Serializable{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="numero") 
	private int numero;
	
	@Column(name="idpaciente")
	private Long idPaciente;

	public EFichaClinica () {
		super();
	}
	
	
	
	public int getNumero() {
		return numero;
	}



	public void setNumero(int numero) {
		this.numero = numero;
	}



	public Long getIdPaciente() {
		return idPaciente;
	}



	public void setIdPaciente(Long idPaciente) {
		this.idPaciente = idPaciente;
	}



	public static long getSerialversionuid() {
		return serialVersionUID;
	}



	private static final long serialVersionUID = 1L;
}
