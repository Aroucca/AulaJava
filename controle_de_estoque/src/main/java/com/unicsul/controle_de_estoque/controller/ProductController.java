package com.unicsul.controle_de_estoque.controller;

import com.unicsul.controle_de_estoque.model.Product;
import com.unicsul.controle_de_estoque.repoitory.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductController {
    @Autowired
    private final ProductRepository productRepository;

    public ProductController(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @GetMapping(value = "/produtos")
    public List<Product> getProducts(){
        return productRepository.findAll();
    }
}
