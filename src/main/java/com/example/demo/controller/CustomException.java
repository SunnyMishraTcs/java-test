package com.example.demo.controller;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class CustomException extends ResponseEntityExceptionHandler{
	

	@ExceptionHandler(value=Exception.class)
	public final ResponseEntity<ErrorMessage> handleDefaultException(Exception e, WebRequest req){
	
		ErrorMessage error=new ErrorMessage(e.getMessage(),"ValidationException......",new Date(),"98");
		return new ResponseEntity<ErrorMessage>(error, HttpStatus.BAD_REQUEST);
	}
	
	@ExceptionHandler(value=RuntimeException.class)
	public final ResponseEntity<ErrorMessage> handleCustomException(RuntimeException e, WebRequest req){
	
		ErrorMessage error=new ErrorMessage(e.getMessage(),"ValidationException======",new Date(),"97");
		//return new ResponseEntity<ErrorMessage>(error, HttpStatus.CONTINUE );
		
		return new ResponseEntity<ErrorMessage>(error, HttpStatus.CREATED);
	}
	
	
	
}

class ErrorMessage{
	
	private String message;
	private String details;
	private Date date;
	private String statusCode;
	
	
	
	public ErrorMessage(String message, String details, Date date,String stataus ) {
		super();
		this.message = message;
		this.details = details;
		this.date = date;
		this.statusCode=stataus;
	}
	
	
	public String getStatusCode() {
		return statusCode;
	}


	public void setStatusCode(String statusCode) {
		this.statusCode = statusCode;
	}


	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getDetails() {
		return details;
	}
	public void setDetails(String details) {
		this.details = details;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	
	
}

