package com.myApp.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.myApp.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product,Long> {

}
 
