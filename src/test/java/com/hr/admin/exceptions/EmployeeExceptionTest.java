package com.hr.admin.exceptions;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class EmployeeExceptionTest {

	@Test
	public void testNoArgs() {

		EmployeeException exception = new EmployeeException();
		Assertions.assertNotNull(exception);

	}

	@Test
	public void testOneArgs() {

		EmployeeException exception = new EmployeeException("test");
		Assertions.assertNotNull(exception);

	}

	@Test
	public void testTwoArgs() {

		EmployeeException exception = new EmployeeException("test", "test1");
		Assertions.assertNotNull(exception);

	}
}
