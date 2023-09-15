package org.example.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.example.entity.Producto;
import org.example.service.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductoController {

    @Autowired
    private ProductoService productoService;

    @Operation( summary = "Ingresa 1 producto")
    @ApiResponses(value = {
        @ApiResponse( responseCode = "200", description = "Ingreso de producto exitoso",
        content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = Producto.class))
        }),
        @ApiResponse( responseCode = "400",description = "Objeto producto invalido",content = @Content),
        @ApiResponse(responseCode = "404", description = "Producto no encontrado" , content = @Content)
    })
    @PostMapping("/agregarProducto")
    public Producto agregarProducto(@RequestBody Producto producto){
        return productoService.saveProducto(producto);
    }

    @PostMapping("/agregarProductos")
    public List<Producto> agregarProductos(@RequestBody List<Producto> productos) {
        return productoService.saveAllProductos(productos);
    }

   @GetMapping("/listarProductos")
    public List<Producto> listarProducto(){
        return productoService.listarProductos();
   }

   @GetMapping("/encontrarPorId/{id}")
    public Producto encontrarPorId(@PathVariable Integer id){
        return productoService.listarPorId(id);
   }

    @GetMapping("/encontrarBodyPorId")
    public Producto encontrarBodyPorId(@RequestBody Producto id){
        Integer identificador = id.getId();
        return productoService.listarPorId(identificador);
    }

    @GetMapping("/producto/{nombre}")
    public Producto encontrarProductoPorNombre(@PathVariable String nombre) {
        return productoService.ListarProductoPorNombre(nombre);
    }

    @DeleteMapping("/borrar/{id}")
    public String borrarProducto( @PathVariable Integer id){
        return productoService.borrarProducto(id);
    }

    @PutMapping("/actualizarProducto")
    public Producto actualizarProducto(@RequestBody Producto producto){
        return productoService.actualizarProducto(producto);
    }

    @GetMapping("/actualizarPorIdQuery")
    public Producto actualizarPorIdQuery(@RequestParam("id") Integer id, @RequestBody Producto Producto){
        return productoService.actualizarPorIdQuery(id,Producto);
    }

    @GetMapping("/actualizarPorIdQuery2/{id}")
    public Producto actualizarPorIdQuery2(@PathVariable Integer id, @RequestBody Producto Producto){
        return productoService.actualizarPorIdQuery(id,Producto);
    }

}
