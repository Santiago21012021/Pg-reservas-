package com.example.demo.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="usuarios")
public class Usuario {
	@Id
	@Column(name="cedula",length=20,unique=true) 
	private Long cedula;
	
	@Column(name="primerNombre",length=20,unique=true) 
	private String primerNombre; 
	
	@Column(name="segundoNombre",length=20,unique=true) 
	private String segundoNombre;
	
	@Column(name="primerApellido",length=20,unique=true) 
	private String primerApellido;
	
	@Column(name="segundoApellido",length=20,unique=true) 
	private String segundoApellido;
	
	@Column(name="telefono",length=20,unique=true) 
	private Long telefono;
	
	@Column(name="fechaNacimiento",length=20,unique=true) 
	private String fechaNacimiento;

	public Usuario(Long cedula, String primerNombre, String segundoNombre, String primerApellido,
			String segundoApellido, Long telefono, String fechaNacimiento) {
		super();
		this.cedula = cedula;
		this.primerNombre = primerNombre;
		this.segundoNombre = segundoNombre;
		this.primerApellido = primerApellido;
		this.segundoApellido = segundoApellido;
		this.telefono = telefono;
		this.fechaNacimiento = fechaNacimiento;
	}

	public Usuario() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Long getCedula() {
		return cedula;
	}

	public void setCedula(Long cedula) {
		this.cedula = cedula;
	}

	public String getPrimerNombre() {
		return primerNombre;
	}

	public void setPrimerNombre(String primerNombre) {
		this.primerNombre = primerNombre;
	}

	public String getSegundoNombre() {
		return segundoNombre;
	}

	public void setSegundoNombre(String segundoNombre) {
		this.segundoNombre = segundoNombre;
	}

	public String getPrimerApellido() {
		return primerApellido;
	}

	public void setPrimerApellido(String primerApellido) {
		this.primerApellido = primerApellido;
	}

	public String getSegundoApellido() {
		return segundoApellido;
	}

	public void setSegundoApellido(String segundoApellido) {
		this.segundoApellido = segundoApellido;
	}

	public Long getTelefono() {
		return telefono;
	}

	public void setTelefono(Long telefono) {
		this.telefono = telefono;
	}

	public String getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(String fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	
}
