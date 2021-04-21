package com.haibasoft.jobber.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.haibasoft.jobber.entities.Jobseeker;
import com.haibasoft.jobber.entities.Language;
import com.haibasoft.jobber.entities.Languagespoken;

public interface LanguagespokenRepository extends CrudRepository<Languagespoken, Integer> {

	List<Languagespoken> findAll();
	
	Languagespoken findById(int id);
	
	List<Languagespoken> findAllByLanguage(Language language);
	
	List<Languagespoken> findAllByJobseeker(Jobseeker jobseeker);
}
