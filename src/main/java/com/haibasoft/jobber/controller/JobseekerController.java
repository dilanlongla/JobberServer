package com.haibasoft.jobber.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.haibasoft.jobber.entities.Jobseeker;
import com.haibasoft.jobber.services.JobseekerService;

/**
 * RestController Class containing all endpoints related to the Jobseeker
 * @author Longla Dilan
 * 
 *
 */
@RestController
@RequestMapping("jobseeker")
@CrossOrigin(origins= {"*"}, maxAge = 4800, allowCredentials = "false" )
public class JobseekerController {

	@Autowired
	private JobseekerService jobseekerService;
	
	/**
	 * @return returns the list of jobseekers
	 * 
	 * method GET
	 * <p>endpoint: domain/jobseeker/
	 */
	@RequestMapping("/")
	public List<Jobseeker> getAllJobseeker() {
		return jobseekerService.jobseekerList();
	}
	
	/**
	 * @param id ID of the jobseeker
	 * @return returns the jobseeker from the id
	 * 
	 * method GET
	 * <p>endpoint: domain/jobseeker/{id}
	 */
	@RequestMapping("/{id}")
	public Jobseeker getJobseekerById(@PathVariable String id) {
		return jobseekerService.findJobseekerById(id);
	}
	
	/**
	 * @param jobseeker Jobseeker object
	 * 
	 * method POST
	 * <p>endpoint: domain/jobseeker/
	 */
	@RequestMapping(method = RequestMethod.POST, value = "/")
	public void addJobseeker(@RequestBody Jobseeker jobseeker) {
		jobseekerService.createJobseeker(jobseeker);
	}
	
	/**
	 * @param jobseeker Jobseeker object
	 * 
	 * method PUT
	 * <p>endpoint: domain/jobseeker/
	 */
	@RequestMapping(method = RequestMethod.PUT, value = "/")
	public void updateJobseeker(@RequestBody Jobseeker jobseeker) {
		jobseekerService.updateJobseeker(jobseeker);
	}
	
	/**
	 * @param id ID of the jobseeker
	 * 
	 * method DELETE
	 * <p>endpoint: domain/jobseeker/{id}
	 */
	@RequestMapping(method = RequestMethod.DELETE, value = "/{id}")
	public void deleteJobseeker(@PathVariable String id) {
		jobseekerService.deleteJobseeker(id);
	}
}
