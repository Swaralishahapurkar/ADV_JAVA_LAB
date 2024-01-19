package com.demo.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.demo.model.Employee;

@Repository
public class EmpdaoImpl implements Empdao {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public List<Employee> findAll() {
		
		
		return jdbcTemplate.query("select * from  employee ", (rs,num)->
		{
			Employee e = new Employee();
			
			e.setEmpid(rs.getInt(1));
			e.setEname(rs.getString(2));
			e.setSal(rs.getDouble(3));
			 return e;
		});
	}

	@Override
	public void add(Employee e) {
		
		String str = "insert into employee values (?,?,?)";
		jdbcTemplate.update(str,new Object[] {
				e.getEmpid(),e.getEname(),e.getSal()});
		
	}

	@Override
	public void removeE(int empid) {
		
		String str = "delete from employee where empid=?";
		jdbcTemplate.update(str,new Object[] {empid});
		
	}

	@Override
	public Employee findById(int empid) {
		
		
		try {
		    return jdbcTemplate.queryForObject("select * from employee where empid=?",new Object[] {empid},BeanPropertyRowMapper.newInstance(Employee.class));
		}
		catch(EmptyResultDataAccessException e) {
			return null;
		}
	}
	
	@Override
	public void modifyEmp(Employee e) {
		
		String str = "update employee set ename=?, sal=? where empid=?";
		
		jdbcTemplate.update(str, new Object[] {e.getEname(),e.getSal(),e.getEmpid()});
		
	}
	
	

}
