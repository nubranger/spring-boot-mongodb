package com.example.springbootmongodb.repositories;

import com.example.springbootmongodb.domain.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<Product, String> {
}
