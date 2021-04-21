package com.haibasoft.jobber.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.haibasoft.jobber.entities.Joboffer;
import com.haibasoft.jobber.repositories.JobofferRepository;


@Service
public class JobofferService {
	
	@Autowired
	private JobofferRepository jobofferRepository;

	public List<Joboffer> jobofferList(){
		return jobofferRepository.findAll();
	}
	
	public Joboffer findJobofferById(int id) {
		return jobofferRepository.findById(id);
	}
	
	
	public void createJoboffer(Joboffer joboffer) {
		jobofferRepository.save(joboffer);
	}  
	
	public void updateJoboffer(Joboffer joboffer) {
		jobofferRepository.save(joboffer);
	} 
	
	public void deleteJoboffer(Joboffer joboffer) {
		jobofferRepository.delete(joboffer);
	}
	
	public void deleteJoboffer(int id) {
		jobofferRepository.deleteById(id);
	}
}
