package com.nl.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nl.interfaceService.IEmployeeService;
import com.nl.modelo.Employee;
import com.nl.repository.EmployeeRepositorio;

@Service
public class EmployeeServiceImp implements IEmployeeService {

	@Autowired
	private EmployeeRepositorio repo;
	
	@Override
	public List<Employee> listar() {
		 
		return repo.findAll();
	}

	@Override
	public Employee listarId(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Employee agregar(Employee e) {
		 
		return repo.save(e);
	}

	@Override
	public Employee editar(Employee e) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Employee eliminar(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}
