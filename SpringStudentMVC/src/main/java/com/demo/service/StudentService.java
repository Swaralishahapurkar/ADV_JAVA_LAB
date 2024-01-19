package com.demo.service;

import java.util.List;

import com.demo.model.Student;

public interface StudentService {

	List<Student> getAll();

	void insertStudent(Student s);

	void deleteE(int empid);

	Student getById(int empid);

	void updatestudent(Student s);

}
