package io.github.joaoprbrasil.productsapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController//Controlador REST
public class ProductsApiApplication {


	public static void main(String[] args) {
		SpringApplication.run(ProductsApiApplication.class, args);
	}

}
