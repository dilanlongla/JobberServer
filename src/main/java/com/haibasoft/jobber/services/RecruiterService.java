package com.haibasoft.jobber.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.haibasoft.jobber.entities.Recruiter;
import com.haibasoft.jobber.repositories.RecruiterRepository;

@Service
public class RecruiterService {

	@Autowired 
	private RecruiterRepository recruiterRepository;
	
	@Autowired
	private JobofferService jobofferService;
	
	public List<Recruiter> recruiterList(){
		return recruiterRepository.findAll();
	} 
	
	public Recruiter findRecruiterById(String id) {
		if (recruiterRepository.findById(id).isPresent()) {
			return recruiterRepository.findById(id).get();
		}else {
			return null;
		}
		
	}
	
	public Recruiter findRecruiterByJobofferId(String id) {
		return recruiterRepository.findByjoboffers(jobofferService.findJobofferById(Integer.parseInt(id)));
		
	}
	
	public void createRecruiter(Recruiter recruiter) {
		recruiterRepository.save(recruiter);
	}
	
	public void updateRecruiter(Recruiter recruiter) {
		recruiterRepository.save(recruiter);
	}
	
	public void deleteRecruiter(Recruiter recruiter) {
		recruiterRepository.delete(recruiter);
	}
	
	public void deleteRecruiter(String id) {
		recruiterRepository.deleteById(id);;
	}
}
