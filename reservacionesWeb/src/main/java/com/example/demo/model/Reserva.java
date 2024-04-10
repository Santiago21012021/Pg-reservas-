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
@Table(name="reservas")
public class Reserva {

	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private Long id;
	
	
	@Column(name="estado",length=25,unique=true) 
	private String estado;  
	
	@Column(name="PuestoOcupado",length=25,unique=true) 
	private Integer PuestoOcupado;  
	
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="id_reservDisponible",referencedColumnName="idReservaDisponible")
	private ReservaDisponible  reservDisponible; 
	
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="idUsuario",referencedColumnName="cedula")
	private Usuario usuario;

	public Reserva(Long id, String estado, Integer puestoOcupado, ReservaDisponible reservDisponible, Usuario usuario) {
		super();
		this.id = id;
		this.estado = estado;
		PuestoOcupado = puestoOcupado;
		this.reservDisponible = reservDisponible;
		this.usuario = usuario;
	}

	public Reserva() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public Integer getPuestoOcupado() {
		return PuestoOcupado;
	}

	public void setPuestoOcupado(Integer puestoOcupado) {
		PuestoOcupado = puestoOcupado;
	}

	public ReservaDisponible getReservDisponible() {
		return reservDisponible;
	}

	public void setReservDisponible(ReservaDisponible reservDisponible) {
		this.reservDisponible = reservDisponible;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	
	

	
	
//	@ManyToOne
//	@JoinColumn(name="datosUsuarios",referencedColumnName="identificacion")
//	private Usuario usuario;
//	
//	@ManyToOne
//	@JoinColumn(name="datosAuto",referencedColumnName="idAuto")
//	private Auto auto;
}
