package com.haibasoft.jobber.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.haibasoft.jobber.entities.Experience;
import com.haibasoft.jobber.entities.Jobseeker;

public interface ExperienceRepository extends CrudRepository<Experience, Integer>{

	List<Experience> findAll();
	
	Experience findById(int id);
	
	List<Experience>  findAllByJobseeker(Jobseeker jobseeker);
}
