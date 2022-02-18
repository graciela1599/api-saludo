package com.api.saludo.response;

import com.api.saludo.entity.Saludo;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SaludoResponse {
	
	
	private Long id = 0l;
	
	private String saludo = " No hay saludo";
	
	private String tipo = "no hay";
	
	public SaludoResponse(Saludo saludo) {
		if(saludo != null) {
			this.id = saludo.getId();
			this.saludo = saludo.getSaludo();
			this.tipo = saludo.getTipo();
		}
	}

}
