package com.abrito10.shoppingcartnew.controller;

import com.abrito10.shoppingcartnew.model.CartNew;
import com.abrito10.shoppingcartnew.model.ItemNew;
import com.abrito10.shoppingcartnew.repository.CartNewRepository;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping(value = "/cartnew")
public class CartNewController {

    @Autowired
    private CartNewRepository cartNewRepository;

    @RequestMapping(method = RequestMethod.POST, value = "/{id}" )
    public CartNew addItem(@PathVariable("id") Integer id, @RequestBody ItemNew item) {
        Optional<CartNew> savedCart = cartNewRepository.findById(id);
        CartNew cart;
        if (savedCart.equals(Optional.empty())) {
            cart = new CartNew(id);
        }
        else {
            cart = savedCart.get();
        }
        cart.getItems().add(item);
        return cartNewRepository.save(cart);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Optional<CartNew> findById(@PathVariable("id") Integer id) {
        return cartNewRepository.findById(id);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public void clear(@PathVariable("id") Integer id) {
        cartNewRepository.deleteById(id);
    }

}