package com.redsocial.aplication.solicitudamistad.service;

public class SolicitudAmistadNoEncontrada extends RuntimeException {
	private final String id;

	public SolicitudAmistadNoEncontrada(String message, String id) {
		super(message);
		this.id = id;
	}

	public static SolicitudAmistadNoEncontrada from(String message, String id) {
		return new SolicitudAmistadNoEncontrada(message, id);
	}

	public String getId() {
		return id;
	}
}