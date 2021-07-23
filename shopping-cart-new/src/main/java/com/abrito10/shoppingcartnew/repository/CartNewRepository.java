package com.abrito10.shoppingcartnew.repository;

import com.abrito10.shoppingcartnew.model.CartNew;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CartNewRepository extends CrudRepository<CartNew, Integer> {

    List<CartNew> findByName(String name);

}
