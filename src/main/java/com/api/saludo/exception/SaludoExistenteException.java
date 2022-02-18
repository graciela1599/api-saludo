package com.api.saludo.exception;

import com.api.saludo.entity.Saludo;
import com.api.saludo.request.CreateSaludoRequest;

public class SaludoExistenteException extends RuntimeException{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private CreateSaludoRequest saludo;
	
	public SaludoExistenteException(CreateSaludoRequest saludo) {
		super("El saludo que se intenta crear, ya existe. ");
		this.saludo = saludo;
	}
	public CreateSaludoRequest getSaludo() {
		return saludo;
	}
}
