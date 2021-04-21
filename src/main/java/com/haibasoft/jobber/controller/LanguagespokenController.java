package com.haibasoft.jobber.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.haibasoft.jobber.entities.Languagespoken;
import com.haibasoft.jobber.services.LangaugespokenService;

/**
 * RestController Class containing all endpoints related to the company
 * @author Longla Dilan
 * 
 */
@RestController
@RequestMapping("languagespoken")
@CrossOrigin(origins= {"*"}, maxAge = 4800, allowCredentials = "false" )
public class LanguagespokenController {

	@Autowired
	private LangaugespokenService langaugespokenService;
	
	/**
	 * @return returns the list of all languagespoken 
	 * 
	 * method GET
	 * <p>endpoint domain/languagespoken/	
	 */
	@RequestMapping("/")
	public List<Languagespoken> getAllLanguagespoken() {
		return langaugespokenService.languagespokenList();
	}
	
	/**
	 * @param id ID of the Jobseeker
	 * @return returns the list of languagespoken from the Jobseeker's id
	 * 
	 * method GET
	 * <p>endpoint: domain/languagespoken/jobseeker/{id}
	 */
	@RequestMapping("/jobseeker/{id}")
	public List<Languagespoken> getLanguagespokenByJobseeker(@PathVariable String id) {
		return langaugespokenService.findLanguagespokenByJobseeker(id);
	}

	/**
	 * @param id ID of the language
	 * @return returns the list of languagespoken from the language's id
	 * 
	 * method GET
	 * <p>endpoint: domain/languagespoken/language/{id}
	 */
	@RequestMapping("/language/{id}")
	public List<Languagespoken> getLanguagespokenByLanguage(@PathVariable String id) {
		return langaugespokenService.findLanguagespokenByLanguage(Integer.parseInt(id));
	}
	
	
	/**
	 * @param id Id of the languagespoken
	 * @return returns the languagespoken from the id
	 * 
	 * method GET
	 * <p>endpoint domain/languagespoken/{id}
	 */
	@RequestMapping("/{id}")
	public Languagespoken getLanguagespokenById(@PathVariable String id) {
		return langaugespokenService.findLanguagespokenById(Integer.parseInt(id));
	}
	
	/**
	 * @param languagespoken Languagespoken object
	 * 
	 * method POST
	 * <p>endpoint domain/languagespoken/
	 */
	@RequestMapping(method = RequestMethod.POST, value = "/")
	public void addLanguagespoken(@RequestBody Languagespoken languagespoken) {
		langaugespokenService.createLanguagespoken(languagespoken);
	}
	
	
	/**
	 * @param languagespoken Languagespoken object
	 * 
	 * method PUT
	 * <p>endpoint domain/languagespoken/
	 */
	@RequestMapping(method = RequestMethod.PUT, value = "/")
	public void updateLanguagespoken(@RequestBody Languagespoken languagespoken) {
		langaugespokenService.createLanguagespoken(languagespoken);
	}
	
	/**
	 * @param id Id of the languagespoken
	 * 
	 * method DELETE
	 * <p>endpoint domain/languagespoken/{id}
	 */
	@RequestMapping(method = RequestMethod.DELETE, value = "/{id}")
	public void deleteLanguagespoken(@PathVariable String id) {
		langaugespokenService.deleteLanguagespoken(Integer.parseInt(id));
	}
}
