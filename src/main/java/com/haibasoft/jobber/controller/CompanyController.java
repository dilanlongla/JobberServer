package com.haibasoft.jobber.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.haibasoft.jobber.entities.Company;
import com.haibasoft.jobber.services.CompanyService;

/**
 * RestController Class containing all endpoints related to the company
 * @author Longla Dilan
 * 
 */
@RestController
@RequestMapping("company")
@CrossOrigin(origins= {"*"}, maxAge = 4800, allowCredentials = "false" )
public class CompanyController {

	@Autowired
	private CompanyService companyService;
	
	/**
	 * @return returns the list of all companies
	 * 
	 * method GET
	 * <p>endpoint domain/company/	
	 */
	@RequestMapping("/")
	public List<Company> getAllCompanies() {
		return companyService.companyList();
	}
	
	
	/**
	 * @param id Id of the company
	 * @return returns the company from the id
	 * 
	 * method GET
	 * <p>endpoint domain/company/{id}
	 */
	@RequestMapping("/{id}")
	public Company getCompanyById(@PathVariable String id) {
		return companyService.findCompanyById(Integer.parseInt(id));
	}
	
	/**
	 * @param recruiterId Id of the Recruiter
	 * @return returns the company from the recruiterId
	 * 
	 * method GET
	 * <p>endpoint domain/company/recruiter/{recruiterId}
	 */
	@RequestMapping("recruiter/{recruiterId}")
	public Company getCompanyByRecruiterId(@PathVariable String recruiterId) {
		return companyService.findCompanyByRecruiterId(recruiterId);
	}
	
	/**
	 * @param company Company object
	 * 
	 * method POST
	 * <p>endpoint domain/company/
	 */
	@RequestMapping(method = RequestMethod.POST, value = "/")
	public void addCompany(@RequestBody Company company) {
		companyService.createCompany(company);
	}
	
	
	/**
	 * @param company Company object
	 * 
	 * method PUT
	 * <p>endpoint domain/company/
	 */
	@RequestMapping(method = RequestMethod.PUT, value = "/")
	public void updateCompany(@RequestBody Company company) {
		companyService.createCompany(company);
	}
	
	/**
	 * @param id Id of the company
	 * 
	 * method DELETE
	 * <p>endpoint domain/company/{id}
	 */
	@RequestMapping(method = RequestMethod.DELETE, value = "/{id}")
	public void deleteCompany(@PathVariable String id) {
		companyService.deleteCompany(Integer.parseInt(id));
	}
}
