package io.github.joaoprbrasil.productsapi.controller;

import io.github.joaoprbrasil.productsapi.model.Product;
import io.github.joaoprbrasil.productsapi.repository.ProductRepository;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;
import java.util.UUID;

@RestController
@RequestMapping("products")
public class ProductController {

    private ProductRepository productRepository;

    public ProductController(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @PostMapping
    public Product save(@RequestBody Product product){
        System.out.println("Product received: " + product);

        var id = UUID.randomUUID().toString();
        product.setId(id);

        productRepository.save(product);
        return product;
    }

    @GetMapping("{id}")
    public Product getById(@PathVariable("id") String id){
        // Optional<Product> product = productRepository.findById(id);
        // return product.isPresent() ? product.get() : null;
        return productRepository.findById(id).orElse(null);
    }

    @DeleteMapping("{id}")
    public void deleteById(@PathVariable("id") String id){
        productRepository.deleteById(id);
    }

}

