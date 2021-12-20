package com.example.BaityAppOrders.repository;

import com.example.BaityAppOrders.entity.Orders;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Orders,Long> {
    Orders findOrderById(Long id);

}
