package com.redsocial.aplication.solicitudamistad.entity;
import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import com.redsocial.aplication.solicitudamistad.models.SolicitudAmistadDto;

@Entity
@Table(name="solicitud_amistad")
public class SolicitudAmistad implements Serializable{
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(generator = "uuid2")
	@GenericGenerator(name = "uuid2", strategy = "uuid2")
	@Column(updatable = false)
	private String id;
	
	@Column
	private String nombre;
	@Column
	private boolean estatus;
	
	public static SolicitudAmistad from (SolicitudAmistadDto solAmistadDto) {
		SolicitudAmistad solicitud = new SolicitudAmistad();
		solicitud.id = solicitud.id;
		solicitud.nombre = solAmistadDto.getNombre();
		solicitud.estatus = solAmistadDto.getEstatus();
		return solicitud;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public boolean isEstatus() {
		return estatus;
	}

	public void setEstatus(boolean estatus) {
		this.estatus = estatus;
	}
}
