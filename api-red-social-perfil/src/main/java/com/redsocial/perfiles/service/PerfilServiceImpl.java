package com.redsocial.perfiles.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.redsocial.perfiles.entity.Perfiles;
import com.redsocial.perfiles.models.PerfilDto;
import com.redsocial.perfiles.repository.PerfilRepository;

@Service
public class PerfilServiceImpl implements PerfilService{

	@Autowired
	PerfilRepository perfilRepository;
	
	@Override
	public Perfiles guardarPerfil(PerfilDto perfilDto) {
		Perfiles perfil = Perfiles.from(perfilDto);
		return perfilRepository.save(perfil);
	}

	@Override
	public void eliminarPerfil(String id) {
		perfilRepository.findById(id)
				.orElseThrow(() -> PerfilNoEncontradoException.from("No se encontro el perfil", id));
		
		perfilRepository.deleteById(id);
	}

	@Override
	public Perfiles editarPerfil(String id, PerfilDto perfilDto) {
		Perfiles perfil = perfilRepository.findById(id)
				.orElseThrow(() -> PerfilNoEncontradoException.from("No se encontro el perfil", id));
		
		perfil = Perfiles.from(perfilDto);
		return perfilRepository.save(perfil);
	}

	@Override
	public Perfiles buscarPerfil(String id) {
		return 		perfilRepository.findById(id)
				.orElseThrow(() -> PerfilNoEncontradoException.from("No se encontro el perfil", id));
	}
}
