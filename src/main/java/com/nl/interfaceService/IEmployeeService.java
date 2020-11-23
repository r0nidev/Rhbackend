package com.nl.interfaceService;

import java.util.List;

import com.nl.modelo.Employee;

public interface IEmployeeService {

	// contenedor de our methods
	List<Employee>listar();
	Employee listarId(int id);
	Employee agregar(Employee e);
	Employee editar(Employee e);
	Employee eliminar(int id);
	
}
