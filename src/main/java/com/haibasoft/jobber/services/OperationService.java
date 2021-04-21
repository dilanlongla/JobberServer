package com.haibasoft.jobber.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.haibasoft.jobber.entities.Operation;
import com.haibasoft.jobber.entities.Recruiter;
import com.haibasoft.jobber.repositories.OperationRepository;


@Service
public class OperationService {

	@Autowired 
	private OperationRepository operationRepository;
	
	public List<Operation> operationsList(){
		return operationRepository.findAll();
	} 
	
	public Operation findOperationById(int id) {
		return operationRepository.findById(id);
	}
	
	public List<Operation> findOperationByRecruiter(Recruiter recruiter){
		return operationRepository.findAllByRecruiter(recruiter);
	}
	
	public void createOperation(Operation operation) {
		operationRepository.save(operation);
	}
	
	public void updateOperation(Operation operation) {
		operationRepository.save(operation);
	}
	
	public void deleteOperation(Operation operation) {
		operationRepository.delete(operation);
	}
	
	public void deleteOperation(int id) {
		operationRepository.deleteById(id);
	}
	
}
