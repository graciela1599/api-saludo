package com.api.saludo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.saludo.entity.Saludo;
import com.api.saludo.exception.OnlyThreeValueException;
import com.api.saludo.exception.SaludoExistenteException;
import com.api.saludo.repository.SaludoRepository;
import com.api.saludo.request.CreateSaludoRequest;

@Service
public class SaludoService {
	
	@Autowired
	SaludoRepository saludoRepository;
	
	public Saludo createSaludo(CreateSaludoRequest createSaludoRequest) {
		
		Saludo saludo = new Saludo(createSaludoRequest);
		
		try {
			saludo = saludoRepository.save(saludo);
		}catch(Exception e) {
			
			if(e.getMessage().contains("only_three_values"))
				throw new OnlyThreeValueException(createSaludoRequest);
			
			throw new SaludoExistenteException(createSaludoRequest);
		}
		
		
		return saludo;
	}
	
	public Saludo getSaludoPorTipo(String tipo) {
		
		Saludo saludo = new Saludo();
		saludo = saludoRepository.findByTipo(tipo);
		return saludo;
	}
	public List<Saludo> getAll(){
		return saludoRepository.findAll();
	}
}
