package com.ejemplo.apiejem.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ejemplo.apiejem.model.Persona;
import com.ejemplo.apiejem.service.PersonaService;

@RestController
@RequestMapping("/api/personas")
public class PersonaController {

    @Autowired
    private PersonaService personaService;

    // Método GET para obtener lista de personas
    @GetMapping
    public List<Persona> mostrar() {
        return personaService.mostrarPersonas();
    }

    // Método POST para agregar persona nueva
    @PostMapping
    public Persona agregar(@RequestBody Persona persona) {
        return personaService.agregarPersona(persona);
    }
}