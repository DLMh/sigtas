package com.dge.exception;

public class ExceptionEntity {

	public String errorType;
	public String message;
	
	public ExceptionEntity(Exception e) {
		this.errorType = e.getClass().getSimpleName();
		this.message = e.getMessage();
	}
	
}
