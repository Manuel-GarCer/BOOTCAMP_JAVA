package com.codigo.reactor;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ReactorApplication implements CommandLineRunner {
	public static void main(String[] args) {
		SpringApplication.run(ReactorApplication.class, args);
	}
	@Override
	public void run (String... args) throws Exception{
		ejemplo1();
	}


	public void ejemplo1(){
	System.out.println("ejemplo1");
	Flux<String> productos = Flux.just("computadora", "mouse", "teclado", "laptop", "tablet"),
			doOnNext(System.out.println);
			//doOnNext(e -> System.out.println(e));
			productos.subcribe();

			Flux<String> productos2 = Flux.just("televisor", "refrigerador", "cocina", "licuadora"),
					doOnNext(e->{
						System.out.println(e);

	});

}