package com.example.demo.controller;

import java.util.Optional;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Bean_1 {
	
	//This is simple pojo class 
	
	/*
	 * @Past(message = "Date should be in past") private Date DOB;
	 */
	/*
	 * @Future(message="date should be in future or present") private LocalDate
	 * joiningDate;
	 */
	@NotNull(message = "name should not be null")
	private Optional<String> name;
	
	@Size(min = 18 , max = 24 , message = "age shoul be in between 18 to 24")
	private String age;

	/*
	 * public Date getDOB() { return DOB; }
	 * 
	 * public void setDOB(Date dOB) { DOB = dOB; }
	 */
	/*
	 * public LocalDate getJoiningDate() { return joiningDate; }
	 * 
	 * public void setJoiningDate(LocalDate joiningDate) { this.joiningDate =
	 * joiningDate; }
	 */
	public Optional<String> getName() {
		return name;
	}

	public void setName(Optional<String> name) {
		this.name = name;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}
	
	
	

	
	
	

}
