package com.haibasoft.jobber.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.haibasoft.jobber.entities.Jobseeker;

public interface JobseekerRepository extends CrudRepository<Jobseeker, String>{

	List<Jobseeker> findAll();
	
	Optional<Jobseeker> findById(String id);
	
	
}
