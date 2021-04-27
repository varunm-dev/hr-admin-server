package com.hr.admin.modal;

public class Employee {

	private int id;
	private String name;
	private String email;
	private String phNumber;
	private String website;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhNumber() {
		return phNumber;
	}

	public void setPhNumber(String phNumber) {
		this.phNumber = phNumber;
	}

	public String getWebsite() {
		return website;
	}

	public void setWebsite(String website) {
		this.website = website;
	}

	public Employee(int id, String name, String email, String phNumber, String website) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.phNumber = phNumber;
		this.website = website;
	}

}
