package com.nl.repository;

import java.util.List;

import org.springframework.data.repository.Repository;

import com.nl.modelo.Employee;

public interface EmployeeRepositorio extends Repository<Employee, Integer> {

	List<Employee>findAll();
	//Employee findOne(int id);// here hay un detalle
	Employee findById(int id);// 
	Employee save(Employee e);
	void delete(Employee e);
	
}
