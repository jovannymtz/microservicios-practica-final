package com.redsocial.aplication.publicaciones.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.redsocial.aplication.publicaciones.entity.Publicaciones;
import com.redsocial.aplication.publicaciones.models.PublicacionDto;
import com.redsocial.aplication.publicaciones.repository.PublicacionRepository;

@Service
public class PublicacionServiceImpl implements PublicacionService{

	@Autowired
	PublicacionRepository publicacionRepository;
	
	@Override
	public Publicaciones crearPublicacion(PublicacionDto publicacionDto) {
		Publicaciones publicacion = Publicaciones.from(publicacionDto);
		return publicacionRepository.save(publicacion);
	}

	@Override
	public Publicaciones editarPublicacion(String id, PublicacionDto publicacionDto) {
		Publicaciones publicacion = publicacionRepository.findById(id)
				.orElseThrow(() -> PublicacionNoEncontrada.from("No se encontro la publicacion", id));
		
		publicacion =Publicaciones.from(publicacionDto);
		return publicacion;
	}

	@Override
	public void eliminarPublicacion(String id) {
		publicacionRepository.findById(id)
				.orElseThrow(() -> PublicacionNoEncontrada.from("No se encontro la publicacion", id));
		
		publicacionRepository.deleteById(id);
		
	}
}