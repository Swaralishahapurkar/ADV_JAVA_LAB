package com.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.model.Employee;
import com.demo.service.EmpService;

@RestController
@RequestMapping("/emp")
public class EmployeeController {
	
	@Autowired
	private EmpService eservice; 
	
	@GetMapping("/employees")
	public ResponseEntity<List<Employee>> getAll()
	{
		return ResponseEntity.ok(eservice.getAll());
	}
	
	@GetMapping("/employees/{empid}")
	public ResponseEntity getById(@PathVariable int empid)
	{
		
		Employee e = eservice.getById(empid);
		if(e!=null)
		{
			return ResponseEntity.ok(e);
		}
		return ResponseEntity.status(HttpStatus.NOT_FOUND).build();	
	}
	
	@PostMapping("/employees/{empid}")
	public ResponseEntity<String> insertemployee(@RequestBody Employee e)
	{
		eservice.insertemployee(e);
		return ResponseEntity.ok("Data Added SuccessFully ");

	}
	
	@DeleteMapping("/employees/{empid}")
	public ResponseEntity<String> deleteEmployee(@PathVariable int empid)
	{
		eservice.deleteE(empid);
		return ResponseEntity.ok("Data Deleted SuccessFully ");
		
	} 
	
	@PutMapping("/employees/{empid}")
	public ResponseEntity<String> updateEmployee(@RequestBody Employee e){
		eservice.updateEmployee(e);
		return ResponseEntity.ok("Data Updated successfully");
		
	}

}
