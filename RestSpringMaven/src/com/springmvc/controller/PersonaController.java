package com.springmvc.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.springmvc.model.Persona;

@RestController
public class PersonaController {
	
	@RequestMapping( value = "/persona", method=RequestMethod.GET, produces= MediaType.APPLICATION_JSON_VALUE)
	public Persona obtenerPersona(){
		Persona persona = new Persona();
		persona.setApellido("Martinez");
		persona.setNombre("Fabio");
		return persona;
	}

}
