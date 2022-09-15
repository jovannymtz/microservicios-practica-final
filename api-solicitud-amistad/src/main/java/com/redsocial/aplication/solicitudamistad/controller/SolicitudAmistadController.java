package com.redsocial.aplication.solicitudamistad.controller;

import static org.springframework.http.HttpStatus.CREATED;
import static org.springframework.http.HttpStatus.OK;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.redsocial.aplication.solicitudamistad.entity.SolicitudAmistad;
import com.redsocial.aplication.solicitudamistad.models.SolicitudAmistadDto;
import com.redsocial.aplication.solicitudamistad.models.TemplateResponse;
import com.redsocial.aplication.solicitudamistad.service.SolicitudAmistadServiceImpl;

@RestController
@RequestMapping("solicitud/amistad/v1")
public class SolicitudAmistadController {
	private static final Logger LOG = LoggerFactory.getLogger(SolicitudAmistadController.class);

	@Autowired
	SolicitudAmistadServiceImpl solAmistadServiceImpl;

	@PostMapping
	@ResponseStatus(CREATED)
	public TemplateResponse enviarSolicitud(@RequestBody SolicitudAmistadDto solAmistadDto) {
		LOG.info("**************** solicitud/amistad/v1 EnviarSolicitud****************");
		SolicitudAmistad solicitud = solAmistadServiceImpl.enviarSolicitud(solAmistadDto);
		TemplateResponse templateResponse = new TemplateResponse("La solicitud se envio con exito", "201", solicitud);
		return templateResponse;
	}

	@DeleteMapping("/{id}")
	@ResponseStatus(OK)
	public TemplateResponse cancelarSolicitud(@PathVariable("id") String id,
			@RequestBody SolicitudAmistadDto solAmistadDto) {
		LOG.info("**************** solicitud/amistad/v1 CancelarSolicitud****************");
		solAmistadServiceImpl.cancelarSolicitud(id);
		TemplateResponse templateResponse = new TemplateResponse("La solicitud se cancelo con exito", "200",
				solAmistadDto);
		return templateResponse;
	}
}
