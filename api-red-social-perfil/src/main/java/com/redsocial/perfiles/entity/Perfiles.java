package com.redsocial.perfiles.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import com.redsocial.perfiles.models.PerfilDto;


@Entity
@Table(name= "perfiles")
public class Perfiles implements Serializable{
	
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(generator = "uuid2")
	@GenericGenerator(name = "uuid2", strategy = "uuid2")
	@Column(updatable = false)
	private String id;
	
	private String nombre;
	
	@Column(name = "apellido_paterno")
	private String apellidoPaterno;
	
	@Column(name = "apellido_materno")
	private String apellidoMaterno;
	
	private String correo;
	private Integer edad;
	private Integer telefono;
	
	//F, M
	@Column(name= "sexo", length = 1)
	private String sexo;
	
	public static Perfiles from(PerfilDto perfilDto) {
		Perfiles perfiles = new Perfiles();
		perfiles.nombre = perfilDto.getNombre();
		perfiles.apellidoPaterno = perfilDto.getApellidoPaterno();
		perfiles.apellidoMaterno = perfilDto.getApellidoMaterno();
		perfiles.correo = perfilDto.getCorreo();
		perfiles.edad = perfilDto.getEdad();
		perfiles.telefono = perfilDto.getTelefono();
		perfiles.sexo = perfilDto.getSexo();
		
		return perfiles;
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

	public String getApellidoPaterno() {
		return apellidoPaterno;
	}

	public void setApellidoPaterno(String apellidoPaterno) {
		this.apellidoPaterno = apellidoPaterno;
	}
	
	public String getApellidoMaterno() {
		return apellidoMaterno;
	}

	public void setApellidoMaterno(String apellidoMaterno) {
		this.apellidoMaterno = apellidoMaterno;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public Integer getEdad() {
		return edad;
	}

	public void setEdad(Integer edad) {
		this.edad = edad;
	}

	public Integer getTelefono() {
		return telefono;
	}

	public void setTelefono(Integer telefono) {
		this.telefono = telefono;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}	
}
