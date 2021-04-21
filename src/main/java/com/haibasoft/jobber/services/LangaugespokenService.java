package com.haibasoft.jobber.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.haibasoft.jobber.entities.Languagespoken;
import com.haibasoft.jobber.repositories.LanguagespokenRepository;

@Service
public class LangaugespokenService {

	@Autowired
	private LanguagespokenRepository languagespokenRepository;
	
	@Autowired
	private LanguageService languageService;
	@Autowired
	private JobseekerService jobseekerService;
	
	public List<Languagespoken> languagespokenList(){
		return languagespokenRepository.findAll();
	}
	
	public Languagespoken findLanguagespokenById(int id) {
		return languagespokenRepository.findById(id);
	}
	
	public List<Languagespoken> findLanguagespokenByLanguage(int id){
		return languagespokenRepository.findAllByLanguage(languageService.findLanguageById(id));
	}
	
	public List<Languagespoken> findLanguagespokenByJobseeker(String id){
		return languagespokenRepository.findAllByJobseeker(jobseekerService.findJobseekerById(id));
	}
	
	public void createLanguagespoken(Languagespoken languagespoken) {
		languagespokenRepository.save(languagespoken);
	}
	
	public void updateLanguagespoken(Languagespoken languagespoken) {
		languagespokenRepository.save(languagespoken);
	}
	
	public void deleteLanguagespoken(Languagespoken languagespoken) {
		languagespokenRepository.delete(languagespoken);
	}
	
	public void deleteLanguagespoken(int id) {
		languagespokenRepository.deleteById(id);
	}
	
}
