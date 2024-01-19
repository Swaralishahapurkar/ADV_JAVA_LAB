package com.demo.dao;

import java.util.List;

import com.demo.model.Student;

public interface Studentdao {
	
	List<Student> findAll();

	void add(Student s);

}
