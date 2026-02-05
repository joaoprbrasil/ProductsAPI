package io.github.joaoprbrasil.produtosapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController//Controlador REST
public class ProdutosApiApplication {



	@GetMapping("/hello-world") //Anotation: está mapeando o retorno deste método para uma req GET
	public String helloWorld(){
		return "Hello World";
	}

	public static void main(String[] args) {
		SpringApplication.run(ProdutosApiApplication.class, args);
	}

}
