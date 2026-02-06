package io.github.joaoprbrasil.productsapi.repository;

import io.github.joaoprbrasil.productsapi.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, String> {

}
