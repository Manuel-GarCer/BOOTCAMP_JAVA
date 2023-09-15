package com.codigo.webflux.controllers;

import com.codigo.webflux.models.dao.ProductoDao;
import com.codigo.webflux.models.entities.Producto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/productos")
public class ProductoRestController {

    @Autowired
    private ProductoDao productoDao;


    @GetMapping("/{id}")
    public Mono<Producto> mostarProductoId(@PathVariable String id){
        //Busqueda de 1 producto
        Mono<Producto> productoMono = productoDao.findById(id);
        return productoMono;
    }

    @GetMapping("/listar")
    public Flux<Producto> mostrarTodo(){
        Flux<Producto> productoFlux = productoDao.findAll();
        return productoFlux;
    }

}
