package com.abrito10.shoppingcartnew.repository;

import com.abrito10.shoppingcartnew.model.Product;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ProductRepository extends CrudRepository<Product, Integer> {

    List<Product> findByName(String name);

}
