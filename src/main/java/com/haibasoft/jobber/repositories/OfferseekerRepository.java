package com.haibasoft.jobber.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.haibasoft.jobber.entities.Joboffer;
import com.haibasoft.jobber.entities.Jobseeker;
import com.haibasoft.jobber.entities.Offerseeker;

public interface OfferseekerRepository extends CrudRepository<Offerseeker, Integer> {

	List<Offerseeker> findAll();
	
	Offerseeker findById(int id);
	
	List<Offerseeker> findAllByJoboffer(Joboffer joboffer);
	
	List<Offerseeker> findAllByJobseeker(Jobseeker jobseeker);
}
