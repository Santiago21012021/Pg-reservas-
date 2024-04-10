package com.example.demo.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;

import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="auto")
public class Auto {
	
	@Id
	@Column(name="placa",length=20) 
	private String placa;
	
	@Column(name="puestos",length=20) 
	private Integer puestos; 
	
	@Column(name="horaSalida",length=20) 
	private String horaSalida;

	public Auto(String placa, Integer puestos, String horaSalida) {
		super();
		this.placa = placa;
		this.puestos = puestos;
		this.horaSalida = horaSalida;
	}

	public Auto() {
		super();
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public Integer getPuestos() {
		return puestos;
	}

	public void setPuestos(Integer puestos) {
		this.puestos = puestos;
	}

	public String getHoraSalida() {
		return horaSalida;
	}

	public void setHoraSalida(String horaSalida) {
		this.horaSalida = horaSalida;
	}
}
