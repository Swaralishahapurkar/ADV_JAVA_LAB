package com.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.demo.model.Employee;
import com.demo.service.EmpService;

@Controller
@RequestMapping("/emp")
public class EmployeeController {
	
	@Autowired
	private EmpService eservice; 
	
	@GetMapping("/employees")
	public ModelAndView getAllEmployee()
	{
		List<Employee> elist = eservice.getAll();
		
		return new ModelAndView ("displayemp","elist",elist) ;
		
	}
	
	@GetMapping("/addemployee")
 	public String addEmployee()
	{
		return "addemp";
	}
	
	@PostMapping("/insertemployee")
	public ModelAndView insertEmployee(@RequestParam int empid, @RequestParam String ename, @RequestParam double sal)
	{
		
		Employee e = new Employee(empid,ename,sal);
		
		eservice.insertEmployee(e);
		return new ModelAndView("redirect:/emp/employees");
		
	}
	
	@GetMapping("/delete/{empid}")
	public ModelAndView deleteEmployee(@PathVariable int empid)
	{
		eservice.deleteE(empid);
		
		return new ModelAndView("redirect:/emp/employees");
		
	} 
	
	@GetMapping("edit/{empid}")
	public ModelAndView editProduct(@PathVariable int empid)
	{
			Employee e = eservice.getById(empid);
			return new ModelAndView("editemp","e",e);
	}
	
	@PostMapping("/updateemployee")
	public ModelAndView updateEmployee(@RequestParam int empid,@RequestParam String ename,@RequestParam double sal)
	{
		Employee e = new Employee(empid,ename,sal);
		eservice.updateEmployee(e);
		return new ModelAndView("redirect:/emp/employees");
	}

}
