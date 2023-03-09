package com.yoyodevelop.productservice.repository;

import com.yoyodevelop.productservice.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepository extends MongoRepository<Product, String> {
}
