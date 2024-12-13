package com.qa.service;

import java.util.List;
import java.util.Scanner;

import com.qa.model.Student;
import com.qa.model.Teacher;

public class ServiceImplementation implements Services{

	
	
	@Override
	public void addStudent(List<Student> list) {
	
		Student student = new Student();
		Scanner sc= new Scanner(System.in);
		System.out.println("please enter student id");
		int id=sc.nextInt();
		student.setId(id);
		System.out.println("please enter student name");
		String name=sc.next();
		student.setName(name);
		System.out.println("please enter student age");
		int age=sc.nextInt();
		student.setAge(age);
		list.add(student);
		System.out.println(list.get(0).toString());
		System.out.println("stu id:"+student.getId()+"stu name:"+student.getName()+"stu age:"+student.getAge());
		
		
	}

	@Override
	public void addTeacher(List<Teacher>list) {
		Scanner sc= new Scanner(System.in);
		Teacher teacher= new Teacher();
		System.out.println("please enter teacher id");
		int id=sc.nextInt();
		teacher.setTid(id);
		System.out.println("please enter teacher course");
		String cname=sc.next();
		teacher.setCourse(cname);
		System.out.println("please enter teacher salary");
		int salary=sc.nextInt();
		teacher.setSalary(salary);
		list.add(teacher);
		System.out.println(list.get(0).toString());
		System.out.println("teacher id"+teacher.getTid()+"teacher course:"+teacher.getCourse()+"tecaher salary"+teacher.getSalary());
		
		
	}
	
	

}
