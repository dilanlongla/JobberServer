package com.haibasoft.jobber.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.haibasoft.jobber.entities.Joboffer;
import com.haibasoft.jobber.entities.Recruiter;

public interface RecruiterRepository extends CrudRepository<Recruiter, String>{

	List<Recruiter> findAll();
	
	Optional<Recruiter> findById(String id);
	
	Recruiter findByjoboffers(Joboffer joboffer);
}
