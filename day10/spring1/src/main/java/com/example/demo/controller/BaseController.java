package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.EmployeeDto;
import com.example.demo.service.EmployeeService;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
public class BaseController {

	@Autowired
	private EmployeeService employeeservice; 
	
//	@GetMapping("/home")
//	public ResponseEntity<String> homeGetMethod(){
//		return ResponseEntity.status(HttpStatus.OK).body("Hello");
//	}
//	
//	@PostMapping("/home/{s}")
//	public ResponseEntity<String> homePostMethod(@PathVariable String s){
//		return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(s);
//	}
//
//	@PostMapping("/home")
//	public ResponseEntity<String> homePost1Method(@RequestParam String str1,@RequestParam String str2){
//		return ResponseEntity.status(HttpStatus.OK).body(str1 + " "+str2);
//	}
//
//	@PutMapping("/excel/{id}")
//	public ResponseEntity<String> homePutMethod(@PathVariable int id,@RequestParam String str1,@RequestParam String str2){
//		id=2;
//		str2="spring1";
//		
//		return ResponseEntity.status(HttpStatus.OK).body(str1="java1"+" "+str2+" "+id);
//	}
//	
//	@DeleteMapping("/del")
//	public ResponseEntity<String> homeDeleteMethod(@RequestParam String str1,@RequestParam String str2){
//		return ResponseEntity.status(HttpStatus.OK).body("record deleted");
//	}
	
	@PostMapping("/add")
	public ResponseEntity<EmployeeDto> addMethod(@RequestBody EmployeeDto empdto){
		EmployeeDto employeedto=employeeservice.addMethod(empdto);
		return ResponseEntity.status(HttpStatus.OK).body(employeedto);
	}
	
	@DeleteMapping("/delete")
	public ResponseEntity<String> deleteMethod(@RequestBody EmployeeDto dto){
		employeeservice.deleteMethod(dto);
		return ResponseEntity.ok("");
	}
	
	@GetMapping("/getAll")
	public ResponseEntity<List<EmployeeDto>> fetchAllMethod(){
		return ResponseEntity.ok(employeeservice.fetchAllMethod());
	}
	
	@GetMapping("/getOne")
	public ResponseEntity<EmployeeDto> fetchByIdMethod(@RequestBody EmployeeDto dto){
		return ResponseEntity.ok(employeeservice.fetchByIdMethod(dto));
	}
}
