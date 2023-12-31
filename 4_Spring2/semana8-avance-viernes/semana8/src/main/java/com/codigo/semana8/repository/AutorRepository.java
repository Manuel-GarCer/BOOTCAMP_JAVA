package com.codigo.semana8.repository;

import com.codigo.semana8.model.Autor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface AutorRepository extends JpaRepository<Autor,Long> {
    Optional<Autor> findByNombre(String nombre);
}
