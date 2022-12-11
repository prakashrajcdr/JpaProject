package com.example.FirstJpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.FirstJpa.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}
