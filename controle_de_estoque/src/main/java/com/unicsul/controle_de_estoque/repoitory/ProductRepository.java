package com.unicsul.controle_de_estoque.repoitory;

import com.unicsul.controle_de_estoque.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends MongoRepository<Product, String> {
}
