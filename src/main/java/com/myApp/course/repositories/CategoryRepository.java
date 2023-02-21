package com.myApp.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.myApp.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category,Long> {

}
 