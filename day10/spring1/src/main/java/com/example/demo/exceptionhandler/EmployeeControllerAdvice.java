package com.example.demo.exceptionhandler;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.example.demo.exception.EmployeeNotFoundException;

@RestControllerAdvice
public class EmployeeControllerAdvice {

	@ExceptionHandler(EmployeeNotFoundException.class)
	public ResponseEntity<String> employeeMessage(RuntimeException exe){
		return ResponseEntity.ok(exe.getMessage());
	}
}
