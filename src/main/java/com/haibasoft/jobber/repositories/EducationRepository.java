package com.haibasoft.jobber.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.haibasoft.jobber.entities.Education;
import com.haibasoft.jobber.entities.Jobseeker;

public interface EducationRepository extends CrudRepository<Education, Integer>{
	
	List<Education> findAll();
	
	Education findById(int id);
	
	List<Education>  findAllByJobseeker(Jobseeker jobseeker);
}
