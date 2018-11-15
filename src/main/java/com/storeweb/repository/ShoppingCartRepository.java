package com.storeweb.repository;

import org.springframework.data.repository.CrudRepository;

import com.storeweb.domain.ShoppingCart;

public interface ShoppingCartRepository extends CrudRepository<ShoppingCart, Long> {

}
