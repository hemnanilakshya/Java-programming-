package com.qa.Exception.Prax;

public class customAgeException extends Exception{
	
	public customAgeException(String message) {
		
		super(message);
	}
	
	public static void main(String[] args) throws Exception {
		
		int age = 17;
		
		if(age<18) {
			
			throw new Exception("illegal age");
		}
		
		System.out.println("legal");
	}

}
