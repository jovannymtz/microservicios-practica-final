package com.redsocial.aplication.publicaciones.entity;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import com.redsocial.aplication.publicaciones.models.PublicacionDto;



@Entity
@Table(name="publicaciones")
public class Publicaciones implements Serializable{
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(generator = "uuid2")
	@GenericGenerator(name = "uuid2", strategy = "uuid2")
	@Column(updatable = false)
	private String id;
	
	@Column
	private String texto;
	
	private String imagen;
	
	private int likes;
	
	public static Publicaciones from(PublicacionDto publicacionDto) {
		Publicaciones publicaciones = new Publicaciones();
		publicaciones.id= publicaciones.id;
		publicaciones.texto = publicacionDto.getTexto();
		publicaciones.imagen = publicacionDto.getImagen();
		publicaciones.likes = publicaciones.likes +1;
		return publicaciones;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}

	public String getImagen() {
		return imagen;
	}

	public void setImagen(String imagen) {
		this.imagen = imagen;
	}

	public int getLikes() {
		return likes;
	}

	public void setLikes(int likes) {
		this.likes = likes;
	}
}