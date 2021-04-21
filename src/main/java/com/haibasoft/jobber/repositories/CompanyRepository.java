package com.haibasoft.jobber.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.haibasoft.jobber.entities.Company;
import com.haibasoft.jobber.entities.Recruiter;

public interface CompanyRepository extends CrudRepository<Company, Integer>{
	
	List<Company> findAll();
	
	Company findById(int id);
	
	Company findByRecruiters(Recruiter recruiter);

}
