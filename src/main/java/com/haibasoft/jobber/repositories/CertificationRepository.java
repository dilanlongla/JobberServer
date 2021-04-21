package com.haibasoft.jobber.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.haibasoft.jobber.entities.Certifications;
import com.haibasoft.jobber.entities.Jobseeker;

public interface CertificationRepository extends CrudRepository<Certifications, Integer>{

	List<Certifications> findAll();
	
	Certifications findById(int id);
	
	List<Certifications>  findAllByJobseeker(Jobseeker jobseeker);
}
