package com.in.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.in.Service.EmployeeService;
import com.in.model.Employee;

@RestController
@RequestMapping("/empApi")
public class EmployeeController {
	
	@Autowired
	private EmployeeService service;

	@GetMapping("/check")
	public ResponseEntity<String> check() {

		return new ResponseEntity<>("EmployeeController Running!!", HttpStatus.OK);
	}

	@PostMapping("/insert")
	public ResponseEntity<Object> insert(@RequestBody Employee employee) {
		Object emp = service.insertData(employee);
		if (emp != null)
			return new ResponseEntity<>(emp, HttpStatus.CREATED);
		else
			return new ResponseEntity<Object>(emp, HttpStatus.BAD_REQUEST);
	}
	@PutMapping("/update")
	public ResponseEntity<Employee> update(@RequestBody Employee employee) {
		Employee emp = service.updateData(employee);
		if(emp!=null)
		return new ResponseEntity<Employee>(employee,HttpStatus.OK);
		else 
		return new ResponseEntity<Employee>(employee,HttpStatus.BAD_REQUEST);
	}
	
}
