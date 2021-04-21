package com.haibasoft.jobber.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.haibasoft.jobber.entities.Experience;
import com.haibasoft.jobber.repositories.ExperienceRepository;

@Service
public class ExperienceServices {

	@Autowired
	ExperienceRepository experienceRepository; 
	@Autowired
	JobseekerService jobseekerService;
	
	public List<Experience> experienceList(){
		return experienceRepository.findAll();
	}
	
	public Experience findExperienceById(int id) {
		return experienceRepository.findById(id);
	}
	
	public List<Experience> findExperienceByJobseekerId(String id) {
		return experienceRepository.findAllByJobseeker(jobseekerService.findJobseekerById(id));
	}
	
	public void createExperience(Experience experience) {
		experienceRepository.save(experience);
	}
	
	public void updateExperience(Experience experience) {
		experienceRepository.save(experience);
	}
	
	public void deleteExperience(Experience experience) {
		experienceRepository.delete(experience);
	}
	
	public void deleteExperience(int id) {
		experienceRepository.deleteById(id);
	}
}
