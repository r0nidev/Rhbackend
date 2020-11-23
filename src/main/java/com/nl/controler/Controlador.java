package com.nl.controler;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nl.interfaceService.IEmployeeService;
import com.nl.modelo.Employee;

// connection with our application frontend
@CrossOrigin(origins =  "http://localhost:4200", maxAge = 3600)
@RestController
@RequestMapping("/employees")
public class Controlador {

	@Autowired
	IEmployeeService service;
	
	@GetMapping
	public List<Employee>listar(){
		return service.listar();
	}	
	/*@PostMapping
	public Employee agregar(RequestBody Employee e) {
		return service.agregar(e);
	}*/
	
	
}
