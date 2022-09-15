package com.redsocial.perfiles.service;

import com.redsocial.perfiles.entity.Perfiles;
import com.redsocial.perfiles.models.PerfilDto;

public interface PerfilService {
	
	Perfiles guardarPerfil(PerfilDto perfilDto);

	void eliminarPerfil(String id);

	Perfiles editarPerfil(String id, PerfilDto perfilDto);

	Perfiles buscarPerfil(String id);

}
