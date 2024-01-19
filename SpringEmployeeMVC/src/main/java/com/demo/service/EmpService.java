package com.demo.service;

import java.util.List;

import com.demo.model.Employee;

public interface EmpService {

	List<Employee> getAll();

	void insertEmployee(Employee e);

	void deleteE(int empid);

	Employee getById(int empid);

	void updateEmployee(Employee e);

}
