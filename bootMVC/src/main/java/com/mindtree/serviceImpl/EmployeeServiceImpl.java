package com.mindtree.serviceImpl;

import java.util.List;

import com.mindtree.Config;
import com.mindtree.entity.Employee;
import com.mindtree.service.EmployeeService;

public class EmployeeServiceImpl implements EmployeeService {

	@Override
	public String addEmployee(Employee emp) {
		return Config.getEmployeeDao().addEmployee(emp);
	}

	@Override
	public String deleteEmployee(String name) {
		return Config.getEmployeeDao().deleteEmployee(name);
	}

	@Override
	public List<Employee> getAllEmployee() {
		return Config.getEmployeeDao().getAllEmployee();
	}

	@Override
	public Employee getEmployeeByName(String name) {
		return Config.getEmployeeDao().getEmployeeByName(name);
	}

	@Override
	public String UpdatePassword(String name, String password) {
		return Config.getEmployeeDao().UpdatePassword(name, password);
	}

}
