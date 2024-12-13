package com.qa.model;

public class Teacher {
	@Override
	public String toString() {
		return "Teacher [tid=" + tid + ", course=" + course + ", salary=" + salary + "]";
	}
	private int tid;
	private String course;
	private int salary;
	
	
	public int getTid() {
		return tid;
	}
	public void setTid(int tid) {
		this.tid = tid;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
}
