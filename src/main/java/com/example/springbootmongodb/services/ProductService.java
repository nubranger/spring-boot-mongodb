package com.example.springbootmongodb.services;

import com.example.springbootmongodb.commands.ProductForm;
import com.example.springbootmongodb.domain.Product;

import java.util.List;

public interface ProductService {

    List<Product> listAll();

    Product getById(String id);

    Product saveOrUpdate(Product product);

    void delete(String id);

    Product saveOrUpdateProductForm(ProductForm productForm);
}
