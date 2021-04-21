package com.haibasoft.jobber.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.haibasoft.jobber.entities.Joboffer;

public interface JobofferRepository extends CrudRepository<Joboffer, Integer>{
	
	List<Joboffer> findAll();
	
	Joboffer findById(int id);
}
