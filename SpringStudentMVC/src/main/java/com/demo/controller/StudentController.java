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

import com.demo.model.Student;
import com.demo.service.StudentService;

@Controller
@RequestMapping("/stu")
public class StudentController {
	
	@Autowired
	private StudentService eservice; 
	
	@GetMapping("/student")
	public ModelAndView getAllStudent()
	{
		List<Student> elist = sservice.getAll();
		
		return new ModelAndView ("displaystudent","slist",slist) ;
		
	}
	
	@GetMapping("/addStudent")
 	public String addStudent()
	{
		return "addStudent";
	}
	
	@PostMapping("/insertStudent")
	public ModelAndView insertEmployee(@RequestParam int empid, @RequestParam String fname, @RequestParam String Lname)
	{
		
		Student s = new Student(empid,fname,Lname);
		
		sservice.insertStudent(s);
		return new ModelAndView("redirect:/stu/student");
		
	}
	
	@GetMapping("/delete/{empid}")
	public ModelAndView deleteEmployee(@PathVariable int empid)
	{
		sservice.deleteE(empid);
		
		return new ModelAndView("redirect:/stu/student");
		
	} 
	
	@GetMapping("edit/{empid}")
	public ModelAndView editProduct(@PathVariable int empid)
	{
			Student s = sservice.getById(empid);
			return new ModelAndView("editstudent","s",s);
	}
	
	@PostMapping("/updatestudent")
	public ModelAndView updatestudent(@RequestParam int empid,@RequestParam String fname,@RequestParam String Lname)
	{
		Student s = new Student (empid,fname,Lname);
		sservice.updateEmployee(s);
		return new ModelAndView("redirect:/emp/employees");
	}

}
