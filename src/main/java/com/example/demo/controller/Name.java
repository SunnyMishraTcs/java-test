package com.example.demo.controller;

public class Name {
	
	private String first_name;
	private String lastName;
	
	
	public Name(String first_name, String lastName) {
		super();
		this.first_name = first_name;
		this.lastName = lastName;
	}


	public String getFirst_name() {
		return first_name;
	}


	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	
	
	

}
