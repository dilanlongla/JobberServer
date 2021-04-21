package com.haibasoft.jobber.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.haibasoft.jobber.entities.Education;
import com.haibasoft.jobber.services.EducationService;


/**
 * RestController Class containing all endpoints related to the education
 * @author Longla Dilan
 *
 */
@RestController
@RequestMapping("education")
@CrossOrigin(origins= {"*"}, maxAge = 4800, allowCredentials = "false" )
public class EducationController {

	@Autowired
	private EducationService educationService;
	
	/**
	 * @return returns list of all education independent of Jobseekers
	 * 
	 * method GET
	 * <p>endpoint: domain/education/
	 */
	@RequestMapping("/")
	public List<Education> getAllEducations() {
		return educationService.educationList();
	}
	
	/**
	 * @param id ID of the education
	 * @return returns the education from the id
	 * 
	 * method GET
	 * <p>endpoint: domain/education/{id}
	 */
	@RequestMapping("/{id}")
	public Education getEducationsById(@PathVariable String id) {
		return educationService.findEducationById(Integer.parseInt(id));
	}
	
	/**
	 * @param id ID of the jobseeker
	 * @return returns the list of education from the Jobseeker's id
	 * 
	 * method GET
	 * <p>endpoint: domain/education/jobseeker/{id}
	 */
	@RequestMapping("/jobseeker/{id}")
	public List<Education> getCertificationsByJobseekerId(@PathVariable String id) {
		return educationService.findEducationByJobseekerId(id);
	}
	
	/**
	 * @param education Education object
	 * 
	 * method POST
	 * <p>endpoint: domain/education/
	 */
	@RequestMapping(method = RequestMethod.POST, value = "/")
	public void addEducation(@RequestBody Education education) {
		educationService.createEducation(education);
	}
	
	/**
	 * @param education Education object
	 * 
	 * method PUT
	 * <p>endpoint: domain/education/
	 */
	@RequestMapping(method = RequestMethod.PUT, value = "/")
	public void updateEducation(@RequestBody Education education) {
		educationService.updateEducation(education);
	}
	
	/**
	 * @param id ID of the education
	 * 
	 * method DELETE
	 * <p>endpoint: domain/education/{id}
	 */
	@RequestMapping(method = RequestMethod.DELETE, value = "/{id}")
	public void deleteEducation(@PathVariable String id) {
		educationService.deleteEducation(Integer.parseInt(id));
	}
	
}
