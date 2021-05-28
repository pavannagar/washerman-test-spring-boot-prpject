package com.dhakad.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dhakad.entity.OrderItem;

public interface OrderItemRepo extends JpaRepository<OrderItem, Integer> {

}
