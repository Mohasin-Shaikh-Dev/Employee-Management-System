package com.employee.www.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.employee.www.entity.Employee;
import com.employee.www.service.EmployeeService;

@CrossOrigin("*")
@RestController
@RequestMapping("/api/employees")
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;
	
	@PostMapping
	public Employee createEmployee(@RequestBody Employee empoyee)
	{
		return this.employeeService.createEmployee(empoyee);
	}
	
	@GetMapping
	public List<Employee> getAllEmployee()
	{
		return this.employeeService.getAllEmployee();
	}
	
	@GetMapping("/{id}")
	public Employee getEmployeeById(@PathVariable long id)
	{
		return this.employeeService.getEmployeeById(id);
	}
	
	@PostMapping("/{id}")
	public ResponseEntity<Employee> updateEmployeeById(@PathVariable long id,@RequestBody Employee employee)
	{
		return this.employeeService.updateEmployeeById(id,employee);
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<Employee> deleteEmployeeById(@PathVariable long id)
	{
		return this.employeeService.deleteEmployeeById(id);
	}
	
	
}
