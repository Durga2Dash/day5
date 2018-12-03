package com.mindtree.service;

import java.util.List;

import com.mindtree.entity.Employee;

public interface EmployeeService {

	String addEmployee(Employee emp); 
	String deleteEmployee(String name);
	List<Employee> getAllEmployee();
	Employee getEmployeeByName(String name);
	String UpdatePassword(String name, String password);
}
