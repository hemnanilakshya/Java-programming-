package com.qa.controller;

import java.util.ArrayList;
import java.util.List;

import com.qa.model.Student;
import com.qa.model.Teacher;
import com.qa.service.ServiceImplementation;
import com.qa.service.Services;

public class Manager {

	public static void main(String[] args) {
		
		List<Student> students= new ArrayList<>();
		List<Teacher> teachers= new ArrayList<>();
		
		Services service = new ServiceImplementation();
		service.addStudent(students);
		service.addTeacher(teachers);
		
		
	

	}

}
