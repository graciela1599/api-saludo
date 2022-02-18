package com.api.saludo.exception;




import com.api.saludo.entity.Saludo;
import com.api.saludo.request.CreateSaludoRequest;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@ToString
public class ErrorDetails {
	
	private Integer codigo;
	private String mensaje;
	private CreateSaludoRequest request;
	private String details;
	
	

}
