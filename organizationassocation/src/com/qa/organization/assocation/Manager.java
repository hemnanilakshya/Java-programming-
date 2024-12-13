package com.qa.organization.assocation;

import java.util.Scanner;

public class Manager {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Department d = new Department();
		System.out.println("Please enter department name:");
		String dname = sc.nextLine();
		d.setDname(dname);

		Employee employee1 = new Employee();
		System.out.println("Please enter employee 1 ID:");
		int eid = sc.nextInt();
		employee1.setEmpid(eid);

		sc.nextLine();
		System.out.println("Please enter employee 1 name:");
		String ename = sc.nextLine();
		employee1.setEname(ename);

		Employee employee2 = new Employee();
		System.out.println("Please enter employee 2 ID:");
		int eid1 = sc.nextInt();
		employee2.setEmpid(eid1);

		sc.nextLine();

		System.out.println("Please enter employee 2 name:");
		String ename1 = sc.nextLine();
		employee2.setEname(ename1);

		d.addEmployee(employee1);
		d.addEmployee(employee2);

		System.out.println("Department: " + d.getDname());
		System.out.println("Employees in the department:");

		for (Employee emp : d.getEmployeelist()) {
			System.out.println("Employee ID: " + emp.getEmpid() + ", Name: " + emp.getEname());
		}

		sc.close();
	}
}
