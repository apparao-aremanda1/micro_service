package com.mocroserv.microserv.repository;

import com.mocroserv.microserv.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepository extends MongoRepository<Product, String> {

}
