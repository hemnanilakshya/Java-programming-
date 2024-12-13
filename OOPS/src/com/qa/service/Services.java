package com.qa.service;

import java.util.List;

import com.qa.model.Student;
import com.qa.model.Teacher;

public interface Services {
	
	void addStudent(List<Student>list);
	void addTeacher(List<Teacher>list);

}
