package com.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.dao.Empdao;
import com.demo.model.Employee;

@Service
public class EmpServiceImpl implements EmpService {
	
	@Autowired
	private Empdao edao;

	@Override
	public List<Employee> getAll() {
		
		return edao.findAll();
	}

	@Override
	public void insertEmployee(Employee e) {
		
		edao.add(e);
		
	}

	@Override
	public void deleteE(int empid) {
		
		edao.removeE(empid);
		
	}

	@Override
	public Employee getById(int empid) {
		
		return edao.findById(empid);
		
	}

	@Override
	public void updateEmployee(Employee e) {
		edao.modifyEmp(e);
	
	}

}
