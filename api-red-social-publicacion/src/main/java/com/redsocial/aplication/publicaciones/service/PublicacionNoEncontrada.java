package com.redsocial.aplication.publicaciones.service;

public class PublicacionNoEncontrada extends RuntimeException{
	  private final String id;

	  public PublicacionNoEncontrada(String message, String id) {
	    super(message);
	    this.id = id;
	  }

	  public static PublicacionNoEncontrada from(String message, String id) {
	    return new PublicacionNoEncontrada(message, id);
	  }

	  public String getId() {
	    return id;
	  }
}
