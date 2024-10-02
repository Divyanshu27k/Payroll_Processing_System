package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.model.Employee;
import com.repository.EmployeeRepository;

public class EmployeeService {

	  @Autowired
	    private EmployeeRepository employeeRepository;

	    public List<Employee> getAllEmployees() {
	        return employeeRepository.findAll();
	    }

	    public Employee saveEmployee(Employee employee) {
	        return employeeRepository.save(employee);
	    }

	    // Additional methods for business logic
	
}
