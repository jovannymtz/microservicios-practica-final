package com.redsocial.aplication.publicaciones.service;

import com.redsocial.aplication.publicaciones.entity.Publicaciones;
import com.redsocial.aplication.publicaciones.models.PublicacionDto;

public interface PublicacionService {
	
	Publicaciones crearPublicacion(PublicacionDto publicacionDto);
	
	Publicaciones editarPublicacion(String id, PublicacionDto publicacionDto);
	
	void eliminarPublicacion(String id);
}
