package com.example.FirstJpa.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.FirstJpa.entity.Employee;
import com.example.FirstJpa.repository.EmployeeRepository;
import com.example.FirstJpa.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService{
	
	@Autowired
	private EmployeeRepository employeeRepository; 

	@Override
	public Employee add(Employee employee) {
		
		return employeeRepository.save(employee);
	}

	@Override
	public Employee update(Employee employee) {
		
		return employeeRepository.save(employee);
	}

	@Override
	public List<Employee> getAllEmployees() {
		
		return employeeRepository.findAll();
	}

	@Override
	public Employee getEmployeeById(long id) {
		
		Optional<Employee> employee = employeeRepository.findById(id);
		
		if(employee.isPresent()){
			
			return employee.get();
			
		}else{
			
			return new Employee();
			
		}
	}

}
