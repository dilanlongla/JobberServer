package com.haibasoft.jobber.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.haibasoft.jobber.entities.Category;
import com.haibasoft.jobber.repositories.CategoryRepository;

@Service
public class CategoryService {
	@Autowired
	private CategoryRepository categoryRepository;
	
	public List<Category> categoryList(){
		return categoryRepository.findAll();
	}
	
	public Category findCategoryById(int id) {
		return categoryRepository.findById(id);
	}
	
	public void createCategory(Category category) {
		categoryRepository.save(category);
	}
	
	public void updateCategory(Category category) {
		categoryRepository.save(category);
	}
	
	public void deleteCategory(Category category) {
		categoryRepository.delete(category);
	}
	
	public void deleteCategory(int id) {
		categoryRepository.deleteById(id);
	}

}
