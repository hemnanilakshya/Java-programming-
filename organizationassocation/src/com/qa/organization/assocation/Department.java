package com.qa.organization.assocation;

import java.util.ArrayList;
import java.util.List;

public class Department {

	private String dname;
	List<Employee> employeelist = new ArrayList<>();

	public String getDname() {
		return dname;
	}

	public void setDname(String dname) {
		this.dname = dname;
	}

	public List<Employee> getEmployeelist() {
		return employeelist;
	}

	public void setEmployeelist(List<Employee> employeelist) {
		this.employeelist = employeelist;
	}

	public void addEmployee(Employee employee) {
		employeelist.add(employee);
	}

}
