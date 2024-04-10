package com.example.demo.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="ReservaDisponible")
public class ReservaDisponible {

	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private Long idReservaDisponible;
	
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="id_placa",referencedColumnName="placa")
	private Auto auto;
	
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="id_destino",referencedColumnName="idDestino")
	private Destino destino;
	
	@Column(name="valorPagar",length=20,unique=true) 
	private Float valorPagar; 
	
	@Column(name="puestosDisponibles",length=20,unique=true) 
	private Integer puestosDisponibles;

	public Long getIdReservaDisponible() {
		return idReservaDisponible;
	}

	public void setIdReservaDisponible(Long idReservaDisponible) {
		this.idReservaDisponible = idReservaDisponible;
	}

	public Auto getAuto() {
		return auto;
	}

	public void setAuto(Auto auto) {
		this.auto = auto;
	}

	public Destino getDestino() {
		return destino;
	}

	public void setDestino(Destino destino) {
		this.destino = destino;
	}

	public Float getValorPagar() {
		return valorPagar;
	}

	public void setValorPagar(Float valorPagar) {
		this.valorPagar = valorPagar;
	}

	public Integer getPuestosDisponibles() {
		return puestosDisponibles;
	}

	public void setPuestosDisponibles(Integer puestosDisponibles) {
		this.puestosDisponibles = puestosDisponibles;
	}

	public ReservaDisponible(Long idReservaDisponible, Auto auto, Destino destino, Float valorPagar,
			Integer puestosDisponibles) {
		super();
		this.idReservaDisponible = idReservaDisponible;
		this.auto = auto;
		this.destino = destino;
		this.valorPagar = valorPagar;
		this.puestosDisponibles = puestosDisponibles;
	}

	public ReservaDisponible() {
		super();
	}


	
}
