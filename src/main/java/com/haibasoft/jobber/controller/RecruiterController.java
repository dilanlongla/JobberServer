package com.haibasoft.jobber.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.haibasoft.jobber.entities.Recruiter;
import com.haibasoft.jobber.services.RecruiterService;

/**
 * RestController Class containing all endpoints related to the company
 * @author Longla Dilan
 * 
 */
@RestController
@RequestMapping("recruiter")
@CrossOrigin(origins= {"*"}, maxAge = 4800, allowCredentials = "false" )
public class RecruiterController {

	@Autowired
	private RecruiterService recruiterService;
	
	/**
	 * @return returns the list of all Recuiters
	 * 
	 * method GET
	 * <p>endpoint domain/recruiter/	
	 */
	@RequestMapping("/")
	public List<Recruiter> getAllRecruiter() {
		return recruiterService.recruiterList();
	}
	
	
	/**
	 * @param id Id of the recruiter
	 * @return returns the recruiter from the id
	 * 
	 * method GET
	 * <p>endpoint domain/recruiter/{id}
	 */
	@RequestMapping("/{id}")
	public Recruiter getRecruiterById(@PathVariable String id) {
		return recruiterService.findRecruiterById(id);
	}
	
	/**
	 * @param jobofferId Id of the Joboffer
	 * @return returns the recruiter from the jobofferId
	 * 
	 * method GET
	 * <p>endpoint domain/recruiter/joboffer/{jobofferId}
	 */
	@RequestMapping("/joboffer/{jobofferId}")
	public Recruiter getRecruiterByJobofferId(@PathVariable String jobofferId) {
		return recruiterService.findRecruiterByJobofferId(jobofferId);
	}
	
	/**
	 * @param recruiter Recruiter object
	 * 
	 * method POST
	 * <p>endpoint domain/recruiter/
	 */
	@RequestMapping(method = RequestMethod.POST, value = "/")
	public void addRecruiter(@RequestBody Recruiter recruiter) {
		recruiterService.createRecruiter(recruiter);
	}
	
	
	/**
	 * @param recruiter Company object
	 * 
	 * method PUT
	 * <p>endpoint domain/recruiter/
	 */
	@RequestMapping(method = RequestMethod.PUT, value = "/")
	public void updateRecruiter(@RequestBody Recruiter recruiter) {
		recruiterService.createRecruiter(recruiter);
	}
	
	/**
	 * @param id Id of the recruiter
	 * 
	 * method DELETE
	 * <p>endpoint domain/recruiter/{id}
	 */
	@RequestMapping(method = RequestMethod.DELETE, value = "/{id}")
	public void deleteRecruiter(@PathVariable String id) {
		recruiterService.deleteRecruiter(id);
	}
}
