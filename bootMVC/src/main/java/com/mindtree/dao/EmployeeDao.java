package com.mindtree.dao;

import java.util.List;

import com.mindtree.entity.Employee;

public interface EmployeeDao {

	String addEmployee(Employee emp); 
	String deleteEmployee(String name);
	List<Employee> getAllEmployee();
	Employee getEmployeeByName(String name);
	String UpdatePassword(String name, String password);
}
