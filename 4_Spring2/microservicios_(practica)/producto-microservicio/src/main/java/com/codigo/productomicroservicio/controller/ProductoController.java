package com.codigo.productomicroservicio.controller;

import com.codigo.productomicroservicio.entity.ProductoEntity;
import com.codigo.productomicroservicio.service.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/productos")
public class ProductoController {

    @Autowired
    private ProductoService productoService;

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<ProductoEntity> getTodosProductos(){
        List<ProductoEntity> dat =  productoService.getTodosProductos();
        if(dat.size() > 0){
            return productoService.getTodosProductos();
        }
        return dat;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void crearProducto(@RequestBody (required = true) ProductoEntity productoEntity){
        productoService.crearProducto(productoEntity);
    }
}
