package com.haibasoft.jobber.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.haibasoft.jobber.entities.Language;
import com.haibasoft.jobber.services.LanguageService;

/**
 * RestController Class containing all endpoints related to the Language
 * @author Longla Dilan
 * 
 *
 */
@RestController
@RequestMapping("language")
@CrossOrigin(origins= {"*"}, maxAge = 4800, allowCredentials = "false" )
public class LanguageController {

	@Autowired
	private LanguageService languageService;
	
	/**
	 * @return returns the list of all languages
	 * 
	 * method GET
	 * <p>endpoint: domain/language/
	 */
	@RequestMapping("/")
	public List<Language> getAllLanguage() {
		return languageService.languageList();
	}
	
	/**
	 * @param id Id of the language
	 * @return returns the language from the id
	 * 
	 * method GET
	 * <p>endpoint: domain/language/{id}
	 */
	@RequestMapping("/{id}")
	public Language getLanguageById(@PathVariable String id) {
		return languageService.findLanguageById(Integer.parseInt(id));
	}
	
	/**
	 * @param language Language object
	 *  
	 * method POST
	 * <p>endpoint: domain/language/
	 */
	@RequestMapping(method = RequestMethod.POST, value = "/")
	public void addLanguage(@RequestBody Language language) {
		languageService.createLanguage(language);
	}
	
	/**
	 * @param language Language object
	 * 
	 * method PUT
	 * <p>endpoint: domain/language/
	 */
	@RequestMapping(method = RequestMethod.PUT, value = "/")
	public void updateLanguage(@RequestBody Language language) {
		languageService.updateLanguage(language);
	}
	
	/**
	 * @param id Id of the language
	 * 
	 * method DELETE
	 * <p>endpoint: domain/language/{id}
	 */
	@RequestMapping(method = RequestMethod.DELETE, value = "/{id}")
	public void deleteLanguage(@PathVariable String id) {
		languageService.deleteLanguage(Integer.parseInt(id));
	}
}
