package com.qa.SchoolManagement;

public class Teacher extends Person{
	
	private String subject;
	private long salary;

	public String getSubject() {
		return subject;
	}



	public void setSubject(String subject) {
		this.subject = subject;
	}



	public long getSalary() {
		return salary;
	}



	public void setSalary(long salary) {
		this.salary = salary;
	}



	@Override
	void displayDetails() {
		System.out.println(" ID = " + getId() + " Name = " + getName() + 
				" AGE = " + getAge() + " subject = " + getSubject() + " salary = " + getSalary());
		
	}

}
