package com.learn.mavendemo.model;

public class Student {
	private int studentId;
	private String studentName;
	private int mark;
	
	public Student() {
		System.out.println("Default Constructor");
	}
	
	public Student(int studentId, String studentName, int mark) {
		//super();
		System.out.println("Parameterized constrctor");
		this.studentId= studentId;
		this.studentName=studentName;
		this.mark=mark;
	}
	

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		System.out.println("Setting student Id"); 
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		System.out.println("Setting Student Name");
		this.studentName = studentName;
	}

	public int getMark() {
		return mark;
	}

	public void setMark(int mark) {
		System.out.println("Setting Student Mark");
		this.mark = mark;
	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", mark=" + mark + "]";
	}
	
	
}
