package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Employee;
import com.example.demo.service.EmployeeService;


@RestController
public class MyController {
	@Autowired
	EmployeeService empServ;
	
	
	@GetMapping("/getallemp")
	public List<Employee> getAllEmployees() {
		return empServ.getAllEmployees();
	}
	
	
	@GetMapping("/getempbyid/{id}")
	public Employee getEmployeeById(@PathVariable int id) {
		return empServ.getEmployeeById(id);
		
	}
	
	@PostMapping("/insertemp")
	public Employee InsertEmployee(@RequestBody Employee  e) {
		return empServ.InsertEmployee(e);
	
	}
	
	@PostMapping("/updateEmp/{id}")
	public Employee UpdateEmployeeById(@PathVariable int  id, @RequestBody Employee e) {
		
		return empServ.updateEmployeeById(id, e);
	}
	
	
	@PostMapping("/deleteEmp/{id}")
	public void  DeleteEmployeeById(@PathVariable int id) {
		
		empServ.deleteEmployeeById(id);
	}
	
	
	
}
