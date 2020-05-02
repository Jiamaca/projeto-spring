package com.jean.projeto.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jean.projeto.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{

}
