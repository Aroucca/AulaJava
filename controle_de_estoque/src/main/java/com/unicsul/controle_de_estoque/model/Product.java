package com.unicsul.controle_de_estoque.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@Document(collection = "produtos")
public class Product {
    private String id;
    private long sku;
    private String name;
    private double price;
    private int quantity;
    private double weight;
    private Size size;
    private String img;
}

