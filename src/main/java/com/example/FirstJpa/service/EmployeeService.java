package com.example.FirstJpa.service;

import java.util.*;

import com.example.FirstJpa.entity.Employee;

public interface EmployeeService {

	Employee add(Employee employee);
	Employee update(Employee employee);
	List<Employee> getAllEmployees();
	Employee getEmployeeById(long id);
	
}
