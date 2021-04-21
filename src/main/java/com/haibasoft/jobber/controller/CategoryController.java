package com.haibasoft.jobber.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.haibasoft.jobber.entities.Category;
import com.haibasoft.jobber.services.CategoryService;

/**
 * RestController Class containing all endpoints related to the category
 * @author Longla Dilan
 */

@RestController
@RequestMapping("category")
@CrossOrigin(origins= {"*"}, maxAge = 4800, allowCredentials = "false" )
public class CategoryController {

	@Autowired
	private CategoryService categoryService;
	
	/**
	 * @return returns the list of all the categories
	 * 
	 * method GET
	 * <p>endpoint: domain/category/
	 */
	@RequestMapping("/")
	public List<Category> getAllCategories() {
		return categoryService.categoryList();
	}
	
	/**
	 * @param id ID of the category
	 * @return Category returns the category from the id
	 * 
	 * method GET
	 * <p>endpoint domain/category/{id}
	 */
	@RequestMapping("/{id}")
	public Category getCategoriesById(@PathVariable String id) {
		return categoryService.findCategoryById(Integer.parseInt(id));
	}
	
	/**
	 * @param category Category object
	 * 
	 * method POST
	 * <p>endpoint domain/category/
	 */
	@RequestMapping(method = RequestMethod.POST, value = "/")
	public void addCategory(@RequestBody Category category) {
		categoryService.createCategory(category);
	}
	
	/**
	 * @param category Category object
	 * 
	 * method PUT
	 * <p>endpoint domain/category/
	 */
	@RequestMapping(method = RequestMethod.PUT, value = "/")
	public void updateCategory(@RequestBody Category category) {
		categoryService.updateCategory(category);
	}
	
	
	/**
	 * @param id ID of the category
	 * 
	 * method DELETE
	 * <p>endpoint domain/category/{id}
	 */
	@RequestMapping(method = RequestMethod.DELETE, value = "/{id}")
	public void deleteCategory(@PathVariable String id) {
		categoryService.deleteCategory(Integer.parseInt(id));
	}
}
