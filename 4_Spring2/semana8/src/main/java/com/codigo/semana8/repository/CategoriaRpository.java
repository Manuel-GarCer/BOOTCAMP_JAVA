package com.codigo.semana8.repository;

import com.codigo.semana8.model.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoriaRpository extends JpaRepository<Categoria, Long> {
}
