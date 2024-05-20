package com.excel.lms.exception;

public class EmployeeExistanceException extends RuntimeException {

	
	private static final long serialVersionUID = 1L;

	public EmployeeExistanceException(String msg) {
		super(msg);
	}
}
