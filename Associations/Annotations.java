package com.qa.annotations;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


//suite - test - class - method
public class Annotations {
	@Test
	public void basetest() {
		System.out.println("Basic test");
	}
	

	@BeforeSuite
	public void beforesuit() {
		
		System.out.println("before suite will execute before any suite");		
	}
	
	@AfterSuite
	
	public void aftersuit() {
		System.out.println("after suite will exeute after any suite");
	}
	
	
	@BeforeTest
	
	public void beforetest() {
		System.out.println("it will run before any test");
	}
		
	@AfterTest
	
	public void aftertest() {
		System.out.println("it will run after any test");
	}
	
	@BeforeMethod
	public void beforemethod() {
		System.out.println("it will run before any method but after suite and test");
		
	}
	
	@AfterMethod
	
	public void aftermethod() {
		System.out.println("it will run after everymethod but before after suite and after test");
	}
	
	@BeforeClass
	
	public void beforeclass() {
	System.out.println("it will run before any class");
	}
	
	@AfterClass
	
	public void afterclass() {
		System.out.println("it will after every class");
	}
	
	
	
}
