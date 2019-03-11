package com.exact.plazos.entity;


import java.io.Serializable;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.Entity;

@Entity
public class Plazo implements Serializable{
	
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="plazo_id")
	private Long id;
	@Column(nullable=false)
	private String nombre;
	
	@Column(name="tiempo_envio", nullable=false)
	private int tiempoEnvio;
	
	@ManyToOne(optional=false)
	@JoinColumn(name="tipo_plazo_id")
	private TipoPlazo tipoPlazo;

	@Column(nullable=false)
	private boolean activo;
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getTiempoEnvio() {
		return tiempoEnvio;
	}

	public void setTiempoEnvio(int tiempoEnvio) {
		this.tiempoEnvio = tiempoEnvio;
	}

	public TipoPlazo getTipoPlazo() {
		return tipoPlazo;
	}

	public void setTipoPlazo(TipoPlazo tipoPlazo) {
		this.tipoPlazo = tipoPlazo;
	}

	public boolean isActivo() {
		return activo;
	}

	public void setActivo(boolean activo) {
		this.activo = activo;
	}


}
