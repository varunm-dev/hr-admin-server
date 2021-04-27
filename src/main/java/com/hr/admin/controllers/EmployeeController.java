package com.hr.admin.controllers;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.hr.admin.exceptions.EmployeeException;
import com.hr.admin.modal.Employee;
import com.hr.admin.services.EmployeeService;

@RestController
@CrossOrigin
public class EmployeeController {

	private static final Logger LOG = LogManager.getLogger(EmployeeController.class.getName());

	@Autowired
	EmployeeService employeeService;

	@GetMapping(path = "/getEmployees")
	public ResponseEntity<List<Employee>> getEmployees() {
		try {
			LOG.info("[ getEmployees method {} ]");
			return new ResponseEntity<List<Employee>>(employeeService.getEmployees(), HttpStatus.OK);
		} catch (EmployeeException e) {
			LOG.debug("[ getEmployees Exception {} ]", e.getMessage());
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}

	}

	@PostMapping(path = "/updateEmployee")
	public ResponseEntity<List<Employee>> updateEmployee(@RequestBody Employee employee) {
		try {
			LOG.info("[ updateEmployee method {} ]");
			return new ResponseEntity<List<Employee>>(employeeService.updateEmployee(employee), HttpStatus.OK);
		} catch (EmployeeException e) {
			LOG.debug("[ updateEmployee Exception {} ]", e.getMessage());
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}
	}
}
