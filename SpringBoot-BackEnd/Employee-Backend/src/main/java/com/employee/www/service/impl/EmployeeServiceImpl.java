package com.employee.www.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.employee.www.entity.Employee;
import com.employee.www.exception.ResourceNotFoundException;
import com.employee.www.repository.EmployeeRepository;
import com.employee.www.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepository;

	@Override
	public List<Employee> getAllEmployee() {
		return this.employeeRepository.findAll();
	}

	@Override
	public Employee getEmployeeById(long id) {
		return this.employeeRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("id not found"));
	}

	@Override
	public Employee createEmployee(Employee empoyee) {
		  return this.employeeRepository.save(empoyee);
	}

	@Override
	public ResponseEntity<Employee> updateEmployeeById(long id, Employee employee) {
		  Employee employeeById=employeeRepository.findById(id).orElseThrow(()-> new ResourceNotFoundException("invalid id"));
		  employeeById.setId(id);
		  employeeById.setFirstName(employee.getFirstName());
		  employeeById.setEmail(employee.getEmail());
		  employeeById.setLastName(employee.getLastName());
		  employeeRepository.save(employeeById);
		  return ResponseEntity.ok(employeeById);
		  
		  
	}

	@Override
	public ResponseEntity<Employee> deleteEmployeeById(long id) {
		Employee employeeById=employeeRepository.findById(id).orElseThrow(()-> new ResourceNotFoundException("id not found"));
		employeeRepository.delete(employeeById);
		return ResponseEntity.ok(employeeById);
		
	}

}
