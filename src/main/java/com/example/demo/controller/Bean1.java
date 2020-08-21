package com.example.demo.controller;

import java.time.LocalDate;
import java.util.Date;

public class Bean1 {
	
	private String name;
	private Date date;
	private String id;
	
	
	public Bean1(String name, Date date, String id) {
		super();
		this.name = name;
		this.date = date;
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return "Bean1 [name=" + name + ", date=" + date + ", id=" + id + "]";
	}
	
	
	
	

}
