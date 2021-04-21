package com.haibasoft.jobber.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.haibasoft.jobber.repositories.JobseekerRepository;
import com.haibasoft.jobber.entities.Jobseeker;

@Service
public class JobseekerService {

	@Autowired
	private JobseekerRepository jobseekerRepository;
	 
	public List<Jobseeker> jobseekerList(){
		return jobseekerRepository.findAll();
	}
	
	public Jobseeker findJobseekerById(String id) {
		
		if (jobseekerRepository.findById(id).isPresent()) {
			return jobseekerRepository.findById(id).get();
		}else {
			return null;
		}
	}
	
	public void createJobseeker(Jobseeker jobseeker) {
		jobseekerRepository.save(jobseeker);
	}
	
	public void updateJobseeker(Jobseeker jobseeker) {
		jobseekerRepository.save(jobseeker);
	}
	
	public void deleteJobseeker(Jobseeker jobseeker) {
		jobseekerRepository.delete(jobseeker);
	}
	
	public void deleteJobseeker(String id) {
		jobseekerRepository.deleteById(id);
	}
}
