package com.haibasoft.jobber.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.haibasoft.jobber.entities.Language;

public interface LanguageRepository extends CrudRepository<Language, Integer>{

	List<Language> findAll();
	
	Language findById(int id);
}
