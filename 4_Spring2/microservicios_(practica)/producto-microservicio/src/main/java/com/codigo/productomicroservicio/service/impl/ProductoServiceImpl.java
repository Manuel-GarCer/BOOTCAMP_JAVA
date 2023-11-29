package com.codigo.productomicroservicio.service.impl;

import com.codigo.productomicroservicio.entity.ProductoEntity;
import com.codigo.productomicroservicio.repository.ProductoRepository;
import com.codigo.productomicroservicio.service.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductoServiceImpl implements ProductoService {

    @Autowired
    private ProductoRepository productoRepository;

    @Override
    public List<ProductoEntity> getTodosProductos() {
        return productoRepository.findAll();
    }

    @Override
    public void crearProducto(ProductoEntity productoEntity) {
        productoRepository.save(productoEntity);
    }
}
