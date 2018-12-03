package com.mindtree;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import com.mindtree.entity.Employee;
import com.mindtree.serviceImpl.EmployeeServiceImpl;
	
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;



@RestController
public class HomeController {

	@RequestMapping(value = "/Admin_Op",method=RequestMethod.POST)
	public ModelAndView admin(HttpServletRequest req)
	{
		System.out.println(req.getParameter("password"));
		return new ModelAndView("Admin_Op.html");
	}
	@RequestMapping(value="/UserDetails")
	public ModelAndView form()
	{
		return new ModelAndView("UserDetails.html");
	}
	@RequestMapping(value="/Success")
	public ModelAndView success(@RequestBody Employee e)
	{
		System.out.println(e.getName());
		Employee emp = new Employee(e.getName(),e.getPassword(),e.getFullName(),
				e.getEmailid(),e.getDob(),e.getGender(),e.getSecurityQuestion(),e.getSecurityAnswer());
		EmployeeServiceImpl es = Config.getEmployeeService();
		es.addEmployee(emp);
		return new ModelAndView("Success.html");
	}
	@RequestMapping("/displayAll")
	public ResponseEntity<List<Employee>> func4()
	{
		List<Employee> l = Config.getEmployeeService().getAllEmployee();
		return new ResponseEntity<List<Employee>>(l,HttpStatus.OK);
	}
	@RequestMapping("/display/{empId}")
	public ResponseEntity<Employee> func5(@PathVariable String empId)
	{
		return new ResponseEntity<Employee> (Config.getEmployeeService().getEmployeeByName(empId),HttpStatus.OK);
	}
}
