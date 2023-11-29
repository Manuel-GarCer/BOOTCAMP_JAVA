package com.codigo.semana7.infraestructure.repository;

import com.codigo.semana7.domain.model.Persona;
import com.codigo.semana7.domain.ports.out.PersonaRepositoryPort;
import com.codigo.semana7.infraestructure.entity.PersonaEntity;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class PersonaJpaRepositoryAdapter implements PersonaRepositoryPort {

    private final PersonaJpaRepository personaJpaRepository;

    public PersonaJpaRepositoryAdapter(PersonaJpaRepository personaJpaRepository) {
        this.personaJpaRepository = personaJpaRepository;
    }

    @Override
    public Persona save(Persona persona) {
        PersonaEntity personaEntity = PersonaEntity.fromDomainModel(persona);
        PersonaEntity savePersonaEntity = personaJpaRepository.save(personaEntity);
        return savePersonaEntity.toDomainModel();
    }

    @Override
    public Optional<Persona> findById(Long id) {
        return personaJpaRepository.findById(id).map(PersonaEntity::toDomainModel);
    }
}
