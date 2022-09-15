package com.redsocial.aplication.solicitudamistad.service;

import com.redsocial.aplication.solicitudamistad.entity.SolicitudAmistad;
import com.redsocial.aplication.solicitudamistad.models.SolicitudAmistadDto;

public interface SolicitudAmistadService {
	
	SolicitudAmistad enviarSolicitud(SolicitudAmistadDto solAmistadDto);
	
	void cancelarSolicitud(String id);
}
