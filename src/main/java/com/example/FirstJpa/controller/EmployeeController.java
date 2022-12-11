package com.example.FirstJpa.controller;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.FirstJpa.entity.Employee;
import com.example.FirstJpa.service.EmployeeService;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;
	
	@PostMapping("/add")
	public Employee addEmployee(@RequestBody Employee employee){
		
		return employeeService.add(employee);

	}

	@PostMapping("/update")
	public Employee updateEmployee(@RequestBody Employee employee){
		
		return employeeService.add(employee);

	}

	@GetMapping("/getAll")
	public List<Employee> getEmployees(){
		
		return employeeService.getAllEmployees();
		
	}

	@GetMapping("/get/{id}")
	public Employee getEmployee(@PathVariable("id") long id){
		
		return employeeService.getEmployeeById(id);
		
	}

	@PostMapping("/test")
	public Employee test(){
		
		return new Employee();
	}
	
}
