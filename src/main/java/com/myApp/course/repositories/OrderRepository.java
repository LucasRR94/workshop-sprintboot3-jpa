package com.myApp.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.myApp.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order,Long> {

}
 