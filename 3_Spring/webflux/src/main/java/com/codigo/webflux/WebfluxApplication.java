package com.codigo.webflux;

import com.codigo.webflux.models.dao.ProductoDao;
import com.codigo.webflux.models.entities.Producto;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.core.ReactiveMongoTemplate;
import reactor.core.publisher.Flux;

import java.util.Date;

@SpringBootApplication
public class WebfluxApplication implements CommandLineRunner {

    @Autowired
    private ProductoDao productoDao;

    private static final Logger log = LoggerFactory.getLogger(WebfluxApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(  WebfluxApplication.class, args);
    }

    @Autowired
    private ReactiveMongoTemplate mongoTemplate;

    @Override
    public void run(String... args) throws Exception {

        mongoTemplate.dropCollection("productos").subscribe();

        Flux.just(new Producto("computadora",3456.90),
                new Producto("laptop",3456.90),
                new Producto("tablet",1000.90),
                new Producto("mouse",34.90),
                new Producto("teclado",56.90))
                .flatMap( producto->{
                    producto.setFechaCreacion(new Date());
                    return productoDao.save(producto);
                }).subscribe( p -> log.info("producto insertado "+ p.getId() + " " + p.getNombre() ));
    }
}
