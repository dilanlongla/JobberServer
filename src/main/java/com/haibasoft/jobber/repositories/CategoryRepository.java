package com.haibasoft.jobber.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.haibasoft.jobber.entities.Category;

public interface CategoryRepository extends CrudRepository<Category, Integer>{

	List<Category> findAll();
	
	Category findById(int id);
}
