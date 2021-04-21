package com.haibasoft.jobber.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.haibasoft.jobber.entities.Offerseeker;
import com.haibasoft.jobber.services.OfferseekerService;

/**
 * RestController Class containing all endpoints related to the company
 * @author Longla Dilan
 * 
 */
@RestController
@RequestMapping("offerseeker")
@CrossOrigin(origins= {"*"}, maxAge = 4800, allowCredentials = "false" )
public class OfferseekerController {

	@Autowired
	private OfferseekerService offerseekerService;
	
	/**
	 * @return returns the list of all offerseekers 
	 * 
	 * method GET
	 * <p>endpoint domain/offerseeker/	
	 */
	@RequestMapping("/")
	public List<Offerseeker> getAllOfferseeker() {
		return offerseekerService.offerseekerList();
	}
	
	/**
	 * @param id ID of the Joboffer
	 * @return returns the list of offerseeker from the Joboffer's id
	 * 
	 * method GET
	 * <p>endpoint: domain/offerseeker/joboffer/{id}
	 */
	@RequestMapping("/joboffer/{id}")
	public List<Offerseeker> getOfferseekersByJoboffer(@PathVariable String id) {
		return offerseekerService.findOfferseekerByJoboffer(Integer.parseInt(id));
	}

	/**
	 * @param id ID of the Jobseeker
	 * @return returns the list of offerseeker from the Jobseeker's id
	 * 
	 * method GET
	 * <p>endpoint: domain/offerseeker/jobseeker/{id}
	 */
	@RequestMapping("/jobseeker/{id}")
	public List<Offerseeker> getOfferseekersByJobseeker(@PathVariable String id) {
		return offerseekerService.findOfferseekerByJobseeker(id);
	}
	
	
	/**
	 * @param id Id of the offerseeker
	 * @return returns the offerseeker from the id
	 * 
	 * method GET
	 * <p>endpoint domain/offerseeker/{id}
	 */
	@RequestMapping("/{id}")
	public Offerseeker getOfferseekerById(@PathVariable String id) {
		return offerseekerService.findOfferseekerById(Integer.parseInt(id));
	}
	
	/**
	 * @param offerseeker Offerseeker object
	 * 
	 * method POST
	 * <p>endpoint domain/offerseeker/
	 */
	@RequestMapping(method = RequestMethod.POST, value = "/")
	public void addOfferseeker(@RequestBody Offerseeker offerseeker) {
		offerseekerService.createOfferseeker(offerseeker);
	}
	
	
	/**
	 * @param offerseeker Offerseeker object
	 * 
	 * method PUT
	 * <p>endpoint domain/offerseeker/
	 */
	@RequestMapping(method = RequestMethod.PUT, value = "/")
	public void updateOfferseeker(@RequestBody Offerseeker offerseeker) {
		offerseekerService.createOfferseeker(offerseeker);
	}
	
	/**
	 * @param id Id of the offerseeker
	 * 
	 * method DELETE
	 * <p>endpoint domain/offerseeker/{id}
	 */
	@RequestMapping(method = RequestMethod.DELETE, value = "/{id}")
	public void deleteOfferseeker(@PathVariable String id) {
		offerseekerService.deleteOfferseeker(Integer.parseInt(id));
	}
}
