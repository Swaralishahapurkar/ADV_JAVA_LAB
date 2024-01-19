package com.demo.model;

public class Student {
	
	private int empid;
	private String fname;
	private String Lname;
	
	
	public Student() {
		super();
	}


	public Student(int empid, String fname, String lname) {
		super();
		this.empid = empid;
		this.fname = fname;
		Lname = lname;
	}


	public int getEmpid() {
		return empid;
	}


	public void setEmpid(int empid) {
		this.empid = empid;
	}


	public String getFname() {
		return fname;
	}


	public void setFname(String fname) {
		this.fname = fname;
	}


	public String getLname() {
		return Lname;
	}


	public void setLname(String lname) {
		Lname = lname;
	}


	@Override
	public String toString() {
		return "Student [empid=" + empid + ", fname=" + fname + ", Lname=" + Lname + "]";
	}
	
	
	
	

}
