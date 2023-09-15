package com.codigo.webflux.models.dao;

import com.codigo.webflux.models.entities.Producto;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface ProductoDao extends ReactiveMongoRepository<Producto,String> {

}
