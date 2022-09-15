package com.redsocial.aplication.publicaciones.controller;

import static org.springframework.http.HttpStatus.CREATED;
import static org.springframework.http.HttpStatus.OK;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.redsocial.aplication.publicaciones.entity.Publicaciones;
import com.redsocial.aplication.publicaciones.models.PublicacionDto;
import com.redsocial.aplication.publicaciones.models.TemplateResponse;
import com.redsocial.aplication.publicaciones.service.PublicacionServiceImpl;

@RestController
@RequestMapping("publicacion/v1")
public class PublicacionController {

	private static final Logger LOG = LoggerFactory.getLogger(PublicacionController.class);
	
	@Autowired
	PublicacionServiceImpl publicacionServiceImpl;
	
	@PostMapping
	@ResponseStatus(CREATED)
	public TemplateResponse crearPublicacion(@RequestBody PublicacionDto publicacionDto) {
		LOG.info("**************** publicacion/v1 CrearPublicacion****************");
		Publicaciones publicaciones = publicacionServiceImpl.crearPublicacion(publicacionDto);
		TemplateResponse templateResponse = new TemplateResponse("La publicacion se creo con exito", "200", publicaciones);
		return templateResponse;
	}
	
	@PutMapping("/{id}")
	@ResponseStatus(OK)
	public TemplateResponse editarPublicacion(@PathVariable("id") String id, @RequestBody PublicacionDto publicacionDto) {
		LOG.info("**************** publicacion/v1 EditarPublicacion****************");
		Publicaciones publicacion = publicacionServiceImpl.editarPublicacion(id, publicacionDto);
		
		TemplateResponse templateResponse = new TemplateResponse("La Modificacion de la publicacion se realizo con exito", "200", publicacion);
		return templateResponse;
	}
	
	@DeleteMapping("/{id}")
	@ResponseStatus(OK)
	public TemplateResponse eliminarPublicacion(@PathVariable("id") String id, @RequestBody PublicacionDto publicacionDto) {
		LOG.info("**************** publicacion/v1 EliminarPublicacion****************");
		publicacionServiceImpl.eliminarPublicacion(id);
		TemplateResponse templateResponse = new TemplateResponse("La publicacion se elimino con exito", "200", publicacionDto);
		return templateResponse;
	}
}