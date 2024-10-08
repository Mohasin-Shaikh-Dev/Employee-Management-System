package com.employee.www.service;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.employee.www.entity.Employee;

public interface EmployeeService {

	List<Employee> getAllEmployee();

	Employee getEmployeeById(long id);

	Employee createEmployee(Employee empoyee);

	ResponseEntity<Employee> updateEmployeeById(long id, Employee employee);

	ResponseEntity<Employee> deleteEmployeeById(long id);

}
