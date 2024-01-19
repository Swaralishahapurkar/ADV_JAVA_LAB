package com.demo.service;

import java.util.List;

import com.demo.model.Student;

@Service
public class StudentServiceImpl implements StudentService {

	@Override
	public List<Student> getAll() {
		return edao.findAll();
	}

	@Override
	public void insertStudent(Student s) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteE(int empid) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Student getById(int empid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updatestudent(Student s) {
		// TODO Auto-generated method stub
		
	}
	
	

}
