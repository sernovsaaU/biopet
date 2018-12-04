package com.avengers.entidad;

	import java.io.Serializable;

	import javax.persistence.Column;
	import javax.persistence.Entity;
	import javax.persistence.GeneratedValue;
	import javax.persistence.GenerationType;
	import javax.persistence.Id;
	import javax.persistence.Table;

	@Entity
	@Table(name="veterinario")
	public class EVeterinario implements Serializable {
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		@Column(name="rut")   //id_veterinario
		private String rut;	
		@Column(name="nombre")	//id_veterinario
		private String nombre;
		@Column(name = "direccion")
		private String direccion;
		@Column(name = "especialidad")
		private String especialidad;
		@Column(name = "telefono")
		private String telefono;
		
		public EVeterinario() {
			super();
		}

		public String getRut() {
			return rut;
		}
		public void setRut(String rut) {
			this.rut= rut;
		}
		public String getNombre() {
			return nombre;
		}
		public void setNombre(String nombre) {
			this.nombre = nombre;
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
		public void setEspecialidad(String especialidad) {
			this.especialidad = especialidad;
		}
		public String getTelefono() {
			return telefono;
		}
		public void setTelefono(String telefono) {
			this.telefono = telefono;
		}
		private static final long serialVersionUID = 1L;
			

}
