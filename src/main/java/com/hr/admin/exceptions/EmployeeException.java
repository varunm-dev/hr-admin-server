package com.hr.admin.exceptions;

public class EmployeeException extends Exception {

	String message;
	String details;

	private static final long serialVersionUID = 1L;

	public EmployeeException() {
		super();
	}

	public EmployeeException(String msg) {
		this.message = msg;
	}

	public EmployeeException(String msg, String details) {
		this.message = msg;
		this.details = details;
	}

}
