package com.redsocial.perfiles.controller;

import static org.springframework.http.HttpStatus.CREATED;
import static org.springframework.http.HttpStatus.OK;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.redsocial.perfiles.entity.Perfiles;
import com.redsocial.perfiles.models.PerfilDto;
import com.redsocial.perfiles.models.TemplateResponse;
import com.redsocial.perfiles.service.PerfilServiceImpl;

@RestController
@RequestMapping("perfil/v1")
public class PerfilController {

	private static final Logger LOG = LoggerFactory.getLogger(PerfilController.class);
	
	@Autowired
	PerfilServiceImpl perfilServiceImpl;
	
	@PostMapping
	@ResponseStatus(CREATED)
	public TemplateResponse crearPerfil(@RequestBody PerfilDto perfilDto) {
		LOG.info("**************** perfil/v1 CrearPerfilNuevo****************");
		Perfiles perfiles = perfilServiceImpl.guardarPerfil(perfilDto);
		TemplateResponse templateResponse = new TemplateResponse("El perfil se a creado correctamente", "201", perfiles);
		return templateResponse;
	}
	
	@DeleteMapping("{id}")
	@ResponseStatus(OK)
	public TemplateResponse eliminarPerfil(@PathVariable("id")String id) {
		LOG.info("**************** perfil/v1 EliminarPerfil ****************");
		perfilServiceImpl.eliminarPerfil(id);
		TemplateResponse templateResponse = new TemplateResponse("El perfil se elimino con exito", "200", id);
		return templateResponse;
	}
		
	@PutMapping("/{id}")
	@ResponseStatus(OK)
	public TemplateResponse editarPerfil(@PathVariable("id")String id, @RequestBody PerfilDto perfilDto) {
		LOG.info("**************** perfil/v1 EditarPerfil ****************");
		Perfiles perfiles = perfilServiceImpl.editarPerfil(id, perfilDto);
		TemplateResponse templateResponse = new TemplateResponse("El perfil se actualizo con exito", "200", perfiles);
		return templateResponse;
	}
	
	@GetMapping("{id}")
	@ResponseStatus(OK)
	public Perfiles buscarPerfil(@PathVariable("id")String id) {
		LOG.info("**************** perfil/v1 BuscarPerfil ****************");
		return perfilServiceImpl.buscarPerfil(id);
	}
}