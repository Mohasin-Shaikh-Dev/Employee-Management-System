package com.employee.www.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.employee.www.entity.Employee;
import com.employee.www.service.EmployeeService;

@CrossOrigin("*")
@RestController
@RequestMapping("employees")
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;
	
	@GetMapping
	public List<Employee> getAllEmployee()
	{
		return this.employeeService.getAllEmployee();
	}
}