package com.avengers.entidad;
import com.avengers.model.MFichaClinica;

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
@Table (name="atencion")
public class EAtencion implements Serializable{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)	
	@Column(name = "numero")
	private Long numero;
	
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm")
	private Date fechaConsulta;
	@Column(name = "descripcion")
	private String descripcion;
	
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name = "numeroF", insertable=false, updatable=false)
	private MFichaClinica fichaClinica;
	public EAtencion() {
		super();
	}
	
	
	
	public Long getNumero() {
		return numero;
	}




	public void setNumero(Long numero) {
		this.numero = numero;
	}




	public Date getFechaConsulta() {
		return fechaConsulta;
	}




	public void setFechaConsulta(Date fechaConsulta) {
		this.fechaConsulta = fechaConsulta;
	}




	public String getDescripcion() {
		return descripcion;
	}




	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}




	public MFichaClinica getFichaClinica() {
		return fichaClinica;
	}




	public void setMFichaClinica(MFichaClinica fichaClinica) {
		this.fichaClinica = fichaClinica;
	}




	public static long getSerialversionuid() {
		return serialVersionUID;
	}




	private static final long serialVersionUID = 1L;
	
	
}

