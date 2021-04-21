package com.haibasoft.jobber.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.haibasoft.jobber.entities.Operation;
import com.haibasoft.jobber.entities.Recruiter;

public interface OperationRepository extends CrudRepository<Operation, Integer>{

	List<Operation> findAll();
	
	List<Operation> findAllByRecruiter(Recruiter recruiter);
	
	Operation findById(int id);
}
