package com.jean.projeto.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jean.projeto.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
