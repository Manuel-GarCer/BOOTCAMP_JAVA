package com.codigo.productomicroservicio.service;

import com.codigo.productomicroservicio.entity.ProductoEntity;

import java.util.List;

public interface ProductoService {
    List<ProductoEntity> getTodosProductos();

    void crearProducto(ProductoEntity productoEntity);
}
