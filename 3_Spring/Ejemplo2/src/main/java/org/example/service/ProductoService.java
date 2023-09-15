package org.example.service;


import org.example.entity.Producto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.example.repository.ProductoRepository;

import javax.persistence.criteria.CriteriaBuilder;
import java.util.List;

@Service
public class ProductoService {

    @Autowired
    private ProductoRepository productoRepository;
    public Producto saveProducto(Producto producto){
        return productoRepository.save(producto);
    }

    public List<Producto> saveAllProductos(List<Producto> productos){
        return productoRepository.saveAll(productos);
    }

    public List<Producto> listarProductos(){
        return productoRepository.findAll();
    }

    public Producto listarPorId(Integer id){
        return productoRepository.findById(id).orElse(null);
    }

    public Producto ListarProductoPorNombre(String nombre){
        return productoRepository.findBynombre(nombre);
    }

    public String borrarProducto(Integer id){
        productoRepository.deleteById(id);
        return "Producto borrado: " + id;
    }

    public Producto actualizarProducto(Producto producto){
        Producto productoExistente = productoRepository.findById(producto.getId()).orElse(null);
        productoExistente.setNombre(producto.getNombre());
        productoExistente.setCantidad(producto.getCantidad());
        productoExistente.setPrecio(producto.getPrecio());
        return  productoRepository.save(productoExistente) ;
    }

    public Producto actualizarPorIdQuery(Integer id, Producto producto){
        Producto productoExistente = productoRepository.findById(id).orElse(null);
        productoExistente.setNombre(producto.getNombre());
        productoExistente.setCantidad(producto.getCantidad());
        productoExistente.setPrecio(producto.getPrecio());
        return productoRepository.save(productoExistente);
    }

}
