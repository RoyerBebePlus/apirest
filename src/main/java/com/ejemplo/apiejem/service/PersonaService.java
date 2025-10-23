package com.ejemplo.apiejem.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;
import com.ejemplo.apiejem.model.Persona;
@Service
public class PersonaService {
		 private List<Persona> personas = new ArrayList<>();
		    public List<Persona> mostrarPersonas() {
		        return personas;
		    }
		    public Persona agregarPersona(Persona p) {
		        personas.add(p);
		        return p;		    
	}

}
