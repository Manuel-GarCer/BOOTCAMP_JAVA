package com.codigo.semana8.service;

import com.codigo.semana8.model.Autor;
import com.codigo.semana8.repository.AutorRepository;
import org.springframework.stereotype.Service;

@Service
public class AutorService {
    private final AutorRepository autorRepository;

    public AutorService(AutorRepository autorRepository) {
        this.autorRepository = autorRepository;
    }

    public List<Autor> obtenerTodosAutores(){
        return autorRepository.findAll()
    }

    public Autor obtenerAutorxid¨(Long id){
        Optional<Autor> autor = autorRepository.findById(id);
        if(autor.isPresent()){
            return autor.get();
        }else{
            throw new RuntimeException("Autor no encontrado");
        }
    }

    public Autor crearAutor(Autor autor){
        return autorRepository.save(autor);
    }

    public Autor actualizarAutor(Long id, Autor autorActualizado){
        Autor autorExistente = obtenerAutorxid(id);

        autorExistente.setNombre(autorActualizado.getNombre());
        autorExistente.setEstado(autorActualizado.getEstado());

        return autorRepository.save(autorExistente);


    }
}
