package com.haibasoft.jobber.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.haibasoft.jobber.entities.Education;
import com.haibasoft.jobber.repositories.EducationRepository;

@Service
public class EducationService {

	@Autowired
	EducationRepository educationRepository; 
	@Autowired
	JobseekerService jobseekerService;
	
	public List<Education> educationList(){
		return educationRepository.findAll();
	}
	
	public Education findEducationById(int id) {
		return educationRepository.findById(id);
	}
	
	public List<Education> findEducationByJobseekerId(String id) {
		return educationRepository.findAllByJobseeker(jobseekerService.findJobseekerById(id));
	}
	
	public void createEducation(Education experience) {
		educationRepository.save(experience);
	}
	
	public void updateEducation(Education experience) {
		educationRepository.save(experience);
	}
	
	public void deleteEducation(Education experience) {
		educationRepository.delete(experience);
	}
	
	public void deleteEducation(int id) {
		educationRepository.deleteById(id);
	}
}
