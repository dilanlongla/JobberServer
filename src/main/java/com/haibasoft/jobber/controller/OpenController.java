package com.haibasoft.jobber.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.haibasoft.jobber.entities.Category;
import com.haibasoft.jobber.entities.Joboffer;
import com.haibasoft.jobber.services.CategoryService;
import com.haibasoft.jobber.services.JobofferService;

/**
 * RestController Class containing all open endpoints
 * @author Longla Dilan
 *
 */
@RestController
@RequestMapping("opencontroller")
@CrossOrigin(origins= {"*"}, maxAge = 4800, allowCredentials = "false" )
public class OpenController {

	@Autowired
	private JobofferService jobofferService;
	@Autowired
	private CategoryService categoryService;
	
	/**
	 * @return returns the list of all Joboffers
	 * 
	 * method GET
	 * <p>endpoint: domain/opencontroller/joboffer/
	 */
	@RequestMapping("/joboffer/")
	public List<Joboffer> getAllJoboffers() {
		return jobofferService.jobofferList();
	}
	
	/**
	 * @return returns the list of all categories
	 * 
	 * method GET
	 * <p>endpoint: domain/opencontroller/category/
	 */
	@RequestMapping("/category/")
	public List<Category> getAllCategories() {
		return categoryService.categoryList();
	}
}
