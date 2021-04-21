package com.haibasoft.jobber.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.haibasoft.jobber.entities.Offerseeker;
import com.haibasoft.jobber.repositories.OfferseekerRepository;

@Service
public class OfferseekerService {

	@Autowired
	private OfferseekerRepository offerseekerRepository;
	@Autowired
	private JobseekerService jobseekerService;
	@Autowired
	private JobofferService jobofferService;
	
	public List<Offerseeker> offerseekerList(){
		return offerseekerRepository.findAll();
	}
	
	public Offerseeker findOfferseekerById(int id) {
		return offerseekerRepository.findById(id);
	}
	
	public List<Offerseeker> findOfferseekerByJoboffer(int id){
		return offerseekerRepository.findAllByJoboffer(jobofferService.findJobofferById(id));
	}
	
	public List<Offerseeker> findOfferseekerByJobseeker(String id){
		return offerseekerRepository.findAllByJobseeker(jobseekerService.findJobseekerById(id));
	}
	
	public void createOfferseeker(Offerseeker offerseeker) {
		offerseekerRepository.save(offerseeker);
	}
	
	public void updateOfferseeker(Offerseeker offerseeker) {
		offerseekerRepository.save(offerseeker);
	}
	
	public void deleteOfferseeker(Offerseeker offerseeker) {
		offerseekerRepository.delete(offerseeker);
	}
	
	public void deleteOfferseeker(int id) {
		offerseekerRepository.deleteById(id);
	}
	
}
