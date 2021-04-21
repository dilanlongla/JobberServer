package com.haibasoft.jobber.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.haibasoft.jobber.entities.Company;
import com.haibasoft.jobber.repositories.CompanyRepository;

@Service
public class CompanyService {
	
	@Autowired
	private CompanyRepository companyRepository;
	
	@Autowired 
	private RecruiterService recruiterService;
	
	public List<Company> companyList(){
		return companyRepository.findAll();
	}
	
	public Company findCompanyById(int id) {
		return companyRepository.findById(id);
	}
	
	public Company findCompanyByRecruiterId(String id) {
		return companyRepository.findByRecruiters(recruiterService.findRecruiterById(id));
	}
	
	public void createCompany(Company company) {
		companyRepository.save(company);
	}
	
	public void updateCompany(Company company) {
		companyRepository.save(company);
	}
	
	public void deleteCompany(Company company) {
		companyRepository.delete(company);
	}
	
	public void deleteCompany(int id) {
		companyRepository.deleteById(id);
	}

}
