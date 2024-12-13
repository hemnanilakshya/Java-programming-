package com.qa.SchoolManagement;

import java.util.Scanner;

public class Student extends Person{
	
	
	private String course;
	private int marks;
	
	
	public static String A="A GRADE";
	public static String B="B GRADE";
	public static String C="C GRADE";
	
	public String getCourse() {
		return course;
	}




	public void setCourse(String course) {
		this.course = course;
	}




	public int getMarks() {
		return marks;
		
	}




	public String setMarks(int marks) {
		this.marks = marks;
		if(marks>70) {
			return A;
			
		}
		else if(marks>=50) {
			return B;
		}
		else if (marks>=10) {
			return C;
			
		}
		
		return "invalid";
		
	}








	@Override
	void displayDetails() {
		System.out.println(" ID = " + getId() + " Name = " + getName() + 
				" AGE = " + getAge() + " Course = " + getCourse() + " Marks = " + getMarks());
		
		
	}

}
