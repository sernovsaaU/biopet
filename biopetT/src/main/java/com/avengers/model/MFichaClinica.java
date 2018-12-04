package com.avengers.model;
import com.avengers.entidad.EFichaClinica;

public class MFichaClinica {
	private int numero;
	
	// Constructores
	public MFichaClinica() {
	}
	public MFichaClinica(EFichaClinica ef) {
		this.numero = ef.getNumero();
	}
	public MFichaClinica(int numero) {
		this.numero = numero;
	}
	
	
	//get
	public int getNumero() {
		return numero;
	}

}
