package com.redsocial.aplication.solicitudamistad.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.redsocial.aplication.solicitudamistad.entity.SolicitudAmistad;
import com.redsocial.aplication.solicitudamistad.models.SolicitudAmistadDto;
import com.redsocial.aplication.solicitudamistad.repository.SolicitudAmistadRepository;

@Service
public class SolicitudAmistadServiceImpl implements SolicitudAmistadService {

	@Autowired
	SolicitudAmistadRepository solicitudAmistadRepository;

	@Override
	public SolicitudAmistad enviarSolicitud(SolicitudAmistadDto solAmistadDto) {
		SolicitudAmistad solicitud = SolicitudAmistad.from(solAmistadDto);
		return solicitudAmistadRepository.save(solicitud);
	}

	@Override
	public void cancelarSolicitud(String id) {
		solicitudAmistadRepository.findById(id)
		.orElseThrow(() -> SolicitudAmistadNoEncontrada.from("No se encontro la solicitud", id));
		
		solicitudAmistadRepository.deleteById(id);
	}

}
