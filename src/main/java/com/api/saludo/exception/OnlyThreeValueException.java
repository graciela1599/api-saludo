package com.api.saludo.exception;


import com.api.saludo.request.CreateSaludoRequest;

import lombok.Getter;

@Getter
public class OnlyThreeValueException extends RuntimeException{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private CreateSaludoRequest saludo;

	public OnlyThreeValueException(CreateSaludoRequest saludo) {
		super("El tipo del saludo solo puede ser: dia, tarde o noche");
		this.saludo = saludo;
	}
}
