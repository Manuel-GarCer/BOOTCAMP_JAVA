package com.codigo.semana7.infraestructure.controller;

import com.codigo.semana7.application.service.PersonaService;
import com.codigo.semana7.domain.model.Persona;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/personas")
public class PersonaController {

    private final PersonaService personaService;

    public PersonaController(PersonaService personaService) {
        this.personaService = personaService;
    }


    @PostMapping
    public ResponseEntity<Persona> createPersona(@RequestBody Persona persona){
        Persona createPersna = personaService.crearPersona(persona);
        return new ResponseEntity<>(createPersna, HttpStatus.CREATED);
    }

    @GetMapping("/{personaId}")
    public ResponseEntity<Persona> getPersonaById(@PathVariable Long personaId){
        return personaService.getPersona(personaId)
                .map(persona -> new ResponseEntity<>(persona,HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }
}
