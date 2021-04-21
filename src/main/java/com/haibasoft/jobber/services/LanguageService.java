package com.haibasoft.jobber.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.haibasoft.jobber.entities.Language;
import com.haibasoft.jobber.repositories.LanguageRepository;

@Service
public class LanguageService {

	@Autowired 
	private LanguageRepository languageRepository;
	
	public List<Language> languageList(){
		return languageRepository.findAll();
	} 
	
	public Language findLanguageById(int id) {
		return languageRepository.findById(id);
	}
	
	public void createLanguage(Language language) {
		languageRepository.save(language);
	}
	
	public void updateLanguage(Language language) {
		languageRepository.save(language);
	}
	
	public void deleteLanguage(Language language) {
		languageRepository.delete(language);
	}
	
	public void deleteLanguage(int id) {
		languageRepository.deleteById(id);
	}
}
