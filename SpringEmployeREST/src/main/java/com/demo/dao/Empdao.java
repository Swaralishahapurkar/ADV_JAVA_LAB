package com.demo.dao;

import java.util.List;

import com.demo.model.Employee;

public interface Empdao {

	List<Employee> findAll();

	void add(Employee e);

	void removeE(int empid);

	Employee findById(int empid);

	void modifyEmp(Employee e);

}
