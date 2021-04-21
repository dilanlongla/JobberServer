package com.haibasoft.jobber.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.haibasoft.jobber.entities.Certifications;
import com.haibasoft.jobber.repositories.CertificationRepository;

@Service
public class CertificationService {

	@Autowired
	CertificationRepository certificationRepository;
	@Autowired
	JobseekerService jobseekerService;
	
	public List<Certifications> certificationList(){
		return certificationRepository.findAll();
	}
	
	public Certifications findCertificationById(int id) {
		return certificationRepository.findById(id);
	}
	
	public List<Certifications> findCertificationByJobseekerId(String id) {
		return certificationRepository.findAllByJobseeker(jobseekerService.findJobseekerById(id));
	}
	
	public void createCertifications(Certifications certifications) {
		certificationRepository.save(certifications);
	}
	
	public void updateCertifications(Certifications certifications) {
		certificationRepository.save(certifications);
	}
	
	public void deleteCertifications(Certifications certifications) {
		certificationRepository.delete(certifications);
	}
	
	public void deleteCertifications(int id) {
		certificationRepository.deleteById(id);
	}
}
