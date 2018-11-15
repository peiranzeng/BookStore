package com.storeweb.repository;

import org.springframework.data.repository.CrudRepository;

import com.storeweb.domain.Order;

public interface OrderRepository extends CrudRepository<Order, Long> {

}
