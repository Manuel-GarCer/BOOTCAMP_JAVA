package com.codigo.productomicroservicio.repository;

import com.codigo.productomicroservicio.entity.ProductoEntity;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductoRepository extends MongoRepository<ProductoEntity,String> {

}
