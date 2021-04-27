package com.hr.admin.serviceimpls;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.hr.admin.controllers.EmployeeController;
import com.hr.admin.exceptions.EmployeeException;
import com.hr.admin.modal.Employee;
import com.hr.admin.services.EmployeeService;

@SpringBootTest
public class EmployeeSerrviceImplTest {

	@Autowired
	private EmployeeService employeeService;

	@Test
	public void testUpdateEmployee() throws Exception {
		Employee emp = new Employee(1, "Varun", "sincere.april.biz", "1-77-234-567", "www.leannne.april.biz");
		List<Employee> entity = employeeService.updateEmployee(emp);
		Assertions.assertEquals(entity.get(0).getName(), emp.getName());
	}

	@Test
	public void testgetEmployees() throws Exception {
		List<Employee> resp = employeeService.getEmployees();
		Assertions.assertEquals(resp.size(), addEmployeesToList().size());
	}

	public List<Employee> addEmployeesToList() {
		List<Employee> employeeList = new ArrayList<Employee>();
		employeeList
				.add(new Employee(1, "Leannne Graham", "sincere.april.biz", "1-77-234-567", "www.leannne.april.biz"));
		employeeList
				.add(new Employee(2, "Ervin Howell", "shanna@melissa.tv", "010-692-6593 x09125", "www.anastasia.net"));
		employeeList
				.add(new Employee(3, "Clementine Bauch", "nathan@yesenia.net", "1-463-123-4447", "www.ramiro.info"));
		employeeList.add(
				new Employee(4, "Patricia Lebsack", "julianne.OConner@kory.org", "493-170-9623 x156", "www.kale.biz"));
		employeeList.add(
				new Employee(5, "Chelsey Dietrich", "lucio_Hettinger@annie.ca", "(254)954-1289", "www.demarco.info"));
		employeeList.add(new Employee(6, "Mrs. Dennis Schulist", "Karley_Dach@jasper.info", "1-477-935-8478 x6430",
				"www.ola.org"));
		employeeList.add(new Employee(7, "Kurtis Weissnat", "Telly.Hoeger@billy.biz", "210.067.6132", "www.elvis.io"));
		employeeList.add(new Employee(8, "Nicholas Runolfsdottir V", "Sherwood@rosamond.me", "586.493.6943 x140",
				"www.jacynthe.com"));
		employeeList.add(new Employee(9, "Glenna Reichert", "Chaim_McDermott@dana.io", "(775)976-6794 x41206",
				"www.conrad.com"));
		employeeList.add(
				new Employee(10, "Clementina DuBuque", "Rey.Padberg@karina.biz", "024-648-3804", "www.ambrose.net"));
		return employeeList;
	}

}
