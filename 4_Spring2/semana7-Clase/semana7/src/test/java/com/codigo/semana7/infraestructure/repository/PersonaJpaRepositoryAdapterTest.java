package com.codigo.semana7.infraestructure.repository;

import com.codigo.semana7.domain.model.Persona;
import com.codigo.semana7.infraestructure.entity.PersonaEntity;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
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
        Persona persona = new Persona(1L,"Manuel", "Garcia", new Date(), "Masculino");
        PersonaEntity personaEntity = new PersonaEntity(1L,"Manuel", "Garcia", new Date(), "Masculino");

        //Simulando Comportamiento
        when(personaJpaRepository.save(Mock.any(personaEntity.class))).thenReturn(personaEntity);

        Persona personaAdapter = personaJpaRepositoryAdapter.save(persona);

        assertNotNull(personaAdapter);
        assertEquals(persona.getId(), personaAdapter.getId());
        assertEquals(persona.getNombre(), personaAdapter.getNombre());
    }
    @Test
    void findById_IsEmpty(){
        Long id = 1L;

        when(personaJpaRepository.fyndById(id)).thenReturn(Optional.empty());

        Optional<Persona> optionalPersona = personaJpaRepositoryAdapter.findById(id);

        assertTrue(optionalPersona.isEmpty());
    }

}