package com.haibasoft.jobber.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.haibasoft.jobber.entities.Certifications;
import com.haibasoft.jobber.services.CertificationService;

/**
 * RestController Class containing all endpoints related to the certifications
 * @author Longla Dilan
 * 
 */
@RestController
@RequestMapping("certification")
@CrossOrigin(origins= {"*"}, maxAge = 4800, allowCredentials = "false" )
public class CertificationController {

	@Autowired
	private CertificationService certificationService;
	
	/**
	 * @return returns the list of all certifications
	 * 
	 * method GET
	 * <p>endpoint domain/certification/
	 */
	@RequestMapping("/")
	public List<Certifications> getAllCertifications() {
		return certificationService.certificationList();
	}
	
	/**
	 * @param id Id of the certification
	 * @return returns the certification from the id
	 * 
	 * method GET
	 * <p>endpoint domain/certification/{id}
	 */
	@RequestMapping("/{id}")
	public Certifications getCertificationsById(@PathVariable String id) {
		return certificationService.findCertificationById(Integer.parseInt(id));
	}
	
	/**
	 * @param id Id of the jobseeker
	 * @return returns the list of certifications from the Jobseeker's id
	 * 
	 * method GET
	 * <p>endpoint domain/certification/jobseeker/{id}
	 */
	@RequestMapping("/jobseeker/{id}")
	public List<Certifications> getCertificationsByJobseekerId(@PathVariable String id) {
		return certificationService.findCertificationByJobseekerId(id);
	}
	
	/**
	 * @param certification Certification object
	 * 
	 * method POST
	 * <p>endpoint domain/certification/
	 */
	@RequestMapping(method = RequestMethod.POST, value = "/")
	public void addCertification(@RequestBody Certifications certification) {
		certificationService.createCertifications(certification);
	}
	
	/**
	 * @param certification Certification object
	 * 
	 * method PUT
	 * <p>endpoint domain/certification/
	 */
	@RequestMapping(method = RequestMethod.PUT, value = "/")
	public void updateCertification(@RequestBody Certifications certification) {
		certificationService.updateCertifications(certification);
	}
	
	/**
	 * @param id Id of the certification
	 * 
	 * method DELETE
	 * <p>endpoint domain/certification/{id}
	 */
	@RequestMapping(method = RequestMethod.DELETE, value = "/{id}")
	public void deleteCertifications(@PathVariable String id) {
		certificationService.deleteCertifications(Integer.parseInt(id));
	}
	
}
