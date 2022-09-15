package com.redsocial.perfiles.service;


public class PerfilNoEncontradoException extends RuntimeException {
	  private final String id;

	  public PerfilNoEncontradoException(String message, String id) {
	    super(message);
	    this.id = id;
	  }

	  public static PerfilNoEncontradoException from(String message, String id) {
	    return new PerfilNoEncontradoException(message, id);
	  }

	  public String getId() {
	    return id;
	  }
}
