package com.hr.admin.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.hr.admin.exceptions.EmployeeException;
import com.hr.admin.modal.Employee;

@Service
public interface EmployeeService {

	public List<Employee> getEmployees() throws EmployeeException;

	public List<Employee> updateEmployee(Employee employee) throws EmployeeException;

}
