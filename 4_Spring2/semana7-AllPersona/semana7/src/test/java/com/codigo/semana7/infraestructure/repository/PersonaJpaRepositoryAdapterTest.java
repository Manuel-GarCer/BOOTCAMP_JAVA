package com.codigo.semana7.infraestructure.repository;

import com.codigo.semana7.domain.model.Persona;
import com.codigo.semana7.infraestructure.entity.PersonaEntity;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import java.util.Date;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

class PersonaJpaRepositoryAdapterTest {

    @Mock
    PersonaJpaRepository personaJpaRepository;

    @InjectMocks
    PersonaJpaRepositoryAdapter personaJpaRepositoryAdapter;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
        personaJpaRepositoryAdapter = new PersonaJpaRepositoryAdapter(personaJpaRepository);
    }

    @Test
    void saveExitosoPersonaEntity(){
        //Loque enviamos al metodo de la clase qeu estamos probando
        Persona persona = new Persona(1L,"Paul","Rodriguez", new Date(),"Masculino");

        //Lo que enviamos a BD como simulación
        PersonaEntity personaEntity = new PersonaEntity();

        //Simulando Comportamiento
        when(personaJpaRepository.save(Mockito.any(PersonaEntity.class))).thenReturn(personaEntity);

        Persona personaAdapter = personaJpaRepositoryAdapter.save(persona);

        assertNotNull(personaAdapter);
        assertEquals(persona.getId(),personaAdapter.getId());
        assertEquals(persona.getNombre(),personaAdapter.getNombre());
    }

    @Test
    void findById_IsEmpty(){
        Long id = 1L;

        when(personaJpaRepository.findById(id)).thenReturn(Optional.empty());

        Optional<Persona> optionalPersona = personaJpaRepositoryAdapter.findById(id);

        assertTrue(optionalPersona.isEmpty());
    }

}