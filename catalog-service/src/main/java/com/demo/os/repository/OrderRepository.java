package com.demo.os.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.os.entity.Order;

import java.util.List;

public interface OrderRepository extends JpaRepository<Order,Integer> {

    List<Order> findByCategory(String category);


}
