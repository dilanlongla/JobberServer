package com.haibasoft.jobber.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.haibasoft.jobber.entities.Joboffer;
import com.haibasoft.jobber.services.JobofferService;


/**
 * RestController Class containing all endpoints related to the Joboffers
 * @author Longla Dilan
 *
 */
@RestController
@RequestMapping("joboffer")
@CrossOrigin(origins= {"*"}, maxAge = 4800, allowCredentials = "false" )
public class JobofferController {

	@Autowired
	private JobofferService jobofferService;
	
	/**
	 * @return returns the list of all Joboffers
	 * 
	 * method GET
	 * <p>endpoint: domain/joboffer/
	 */
	@RequestMapping("/")
	public List<Joboffer> getAllExperiences() {
		return jobofferService.jobofferList();
	}
	
	/**
	 * @param id ID of the Joboffer
	 * @return returns the Joboffer from the id
	 * 
	 * method GET
	 * <p>endpoint: domain/joboffer/{id}
	 */
	@RequestMapping("/{id}")
	public Joboffer getJoboffersById(@PathVariable String id) {
		return jobofferService.findJobofferById(Integer.parseInt(id));
	}
	
	/**
	 * @param joboffer Joboffer object
	 * 
	 * method POST
	 * <p>endpoint: domain/joboffer/
	 */
	@RequestMapping(method = RequestMethod.POST, value = "/")
	public void addJoboffer(@RequestBody Joboffer joboffer) {
		jobofferService.createJoboffer(joboffer);
	}
	
	/**
	 * @param joboffer Joboffer object
	 * 
	 * method PUT
	 * <p>endpoint: domain/joboffer/
	 */
	@RequestMapping(method = RequestMethod.PUT, value = "/")
	public void updateJoboffer(@RequestBody Joboffer joboffer) {
		jobofferService.updateJoboffer(joboffer);
	}
	
	/**
	 * @param id ID of the Joboffer
	 * 
	 * method DELETE
	 * <p>endpoint: domain/joboffer/{id}
	 */
	@RequestMapping(method = RequestMethod.DELETE, value = "/{id}")
	public void deleteJoboffer(@PathVariable String id) {
		jobofferService.deleteJoboffer(Integer.parseInt(id));
	}
	
}
