package com.example.demo.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="destino")
public class Destino {
	
	@Id
	@Column(name="idDestino",length=20,unique=true) 
	private Integer idDestino;
	
	@Column(name="fechaSalida",length=20,unique=true) 
	private String fechaSalida; 
	
	@Column(name="destinio",length=20,unique=true) 
	private String destinio;

	public Destino(Integer idDestino, String fechaSalida, String destinio) {
		super();
		this.idDestino = idDestino;
		this.fechaSalida = fechaSalida;
		this.destinio = destinio;
	}

	public Destino() {
		super();
	}

	public Integer getIdDestino() {
		return idDestino;
	}

	public void setIdDestino(Integer idDestino) {
		this.idDestino = idDestino;
	}

	public String getFechaSalida() {
		return fechaSalida;
	}

	public void setFechaSalida(String fechaSalida) {
		this.fechaSalida = fechaSalida;
	}

	public String getDestinio() {
		return destinio;
	}

	public void setDestinio(String destinio) {
		this.destinio = destinio;
	}
	
	
}
