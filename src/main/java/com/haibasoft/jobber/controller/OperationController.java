package com.haibasoft.jobber.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.haibasoft.jobber.entities.Operation;
import com.haibasoft.jobber.services.OperationService;

/**
 * RestController Class containing all endpoints related to the Operations
 * @author Longla Dilan
 * 
 *
 */
@RestController
@RequestMapping("operation")
@CrossOrigin(origins= {"*"}, maxAge = 4800, allowCredentials = "false" )
public class OperationController {

	@Autowired
	private OperationService operationService;
	
	/**
	 * @return returns the list of operations
	 * 
	 * method GET
	 * <p>endpoint: domain/operation/
	 */
	@RequestMapping("/")
	public List<Operation> getAllOperation() {
		return operationService.operationsList();
	}
	
	/**
	 * @param id Id of the operation
	 * @return returns the operation from the id
	 * 
	 * method GET
	 * <p>endpoint: domain/operation/{id}
	 */
	@RequestMapping("/{id}")
	public Operation getOperationById(@PathVariable String id) {
		return operationService.findOperationById(Integer.parseInt(id));
	}
	
	/**
	 * @param operation Operation object
	 * 
	 * method POST
	 * <p>endpoint: domain/operation/
	 */
	@RequestMapping(method = RequestMethod.POST, value = "/")
	public void addOperation(@RequestBody Operation operation) {
		operationService.createOperation(operation);
	}
	
	/**
	 * @param operation Operation object
	 * 
	 * method PUT
	 * <p>endpoint: domain/operation/
	 */
	@RequestMapping(method = RequestMethod.PUT, value = "/")
	public void updateOperation(@RequestBody Operation operation) {
		operationService.createOperation(operation);
	}
	
	/**
	 * @param id ID of the operation
	 * 
	 * method DELETE
	 * <p>endpoint: domain/operation/{id}
	 */
	@RequestMapping(method = RequestMethod.DELETE, value = "/{id}")
	public void deleteOperation(@PathVariable String id) {
		operationService.deleteOperation(Integer.parseInt(id));
	}
}
