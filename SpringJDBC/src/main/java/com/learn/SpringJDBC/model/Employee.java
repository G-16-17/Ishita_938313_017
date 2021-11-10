package com.learn.SpringJDBC.model;

import java.time.LocalDate;

public class Employee {
	private int employeeNumber;
	private String employeeName;
	private String job;
	private int salary;
	private LocalDate hireDate;
	private int managerNumber;
	private int comm;
	private int departmentNumber;
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	public Employee(int employeeNumber, String employeeName, String job, int salary, LocalDate hireDate,
			int managerNumber, int comm, int departmentNumber) {
		super();
		this.employeeNumber = employeeNumber;
		this.employeeName = employeeName;
		this.job = job;
		this.salary = salary;
		this.hireDate = hireDate;
		this.managerNumber = managerNumber;
		this.comm = comm;
		this.departmentNumber = departmentNumber;
	}
	public int getEmployeeNumber() {
		return employeeNumber;
	}
	public void setEmployeeNumber(int employeeNumber) {
		this.employeeNumber = employeeNumber;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public LocalDate getHireDate() {
		return hireDate;
	}
	public void setHireDate(LocalDate hireDate) {
		this.hireDate = hireDate;
	}
	public int getManagerNumber() {
		return managerNumber;
	}
	public void setManagerNumber(int managerNumber) {
		this.managerNumber = managerNumber;
	}
	public int getComm() {
		return comm;
	}
	public void setComm(int comm) {
		this.comm = comm;
	}
	public int getDepartmentNumber() {
		return departmentNumber;
	}
	public void setDepartmentNumber(int departmentNumber) {
		this.departmentNumber = departmentNumber;
	}
	@Override
	public String toString() {
		return String.format("%-10s%-15s%-15s%-15s%-10s%-10s%-10s%-10s",employeeNumber,employeeName,job,hireDate,managerNumber,salary,comm,departmentNumber);
	}
	
}


