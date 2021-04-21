package com.haibasoft.jobber.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.haibasoft.jobber.entities.Experience;
import com.haibasoft.jobber.services.ExperienceServices;


/**
 * RestController Class containing all endpoints related to the Experience
 * @author Longla Dilan
 * 
 *
 */
@RestController
@RequestMapping("experience")
@CrossOrigin(origins= {"*"}, maxAge = 4800, allowCredentials = "false" )
public class ExperienceController {

	@Autowired
	private ExperienceServices experienceServices;
	
	/**
	 * @return returns list of all experiences independent of the jobseekers
	 * 
	 * method GET
	 * <p>endpoint: domain/experience/
	 */
	@RequestMapping("/")
	public List<Experience> getAllExperiences() {
		return experienceServices.experienceList();
	}
	
	/**
	 * @param id ID of the experience
	 * @return returns the experience from the id
	 * 
	 * method GET
	 * <p>endpoint: domain/experience/
	 */
	@RequestMapping("/{id}")
	public Experience getEducationsById(@PathVariable String id) {
		return experienceServices.findExperienceById(Integer.parseInt(id));
	}
	
	/**
	 * @param id Id of the Jobseeker
	 * @return returns list of experiences from the Jobseeker's Id
	 * 
	 * method GET
	 * <p>endpoint: domain/experience/jobseeker/{id}
	 */
	@RequestMapping("/jobseeker/{id}")
	public List<Experience> getExperiencesByJobseekerId(@PathVariable String id) {
		return experienceServices.findExperienceByJobseekerId(id);
	}
	
	/**
	 * @param experience Experience object
	 *  
	 * method POST 
	 * <p>endpoint: domain/experience/
	 */
	@RequestMapping(method = RequestMethod.POST, value = "/")
	public void addExperience(@RequestBody Experience experience) {
		experienceServices.createExperience(experience);
	}
	
	/**
	 * @param experience Experience object
	 * 
	 * method PUT
	 * <p>endpoint: domain/experience/
	 */
	@RequestMapping(method = RequestMethod.PUT, value = "/")
	public void updateExperience(@RequestBody Experience experience) {
		experienceServices.updateExperience(experience);
	}
	
	/**
	 * @param id ID of the experience
	 * 
	 * method DELETE
	 * <p>endpoint: domain/experience/{id}
	 */
	@RequestMapping(method = RequestMethod.DELETE, value = "/{id}")
	public void deleteExperience(@PathVariable String id) {
		experienceServices.deleteExperience(Integer.parseInt(id));
	}
	
}
