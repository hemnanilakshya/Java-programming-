package com.qa.Exception.Prax;

public class BasicExceptionHandlingExample {

	public static void main(String[] args) {
		
		try {
			int a=10;
			int b=0;
			int result= a/b;
			System.out.println("result is:"+ result);
			
		}
		catch(ArithmeticException e) {
			System.out.println("cannot divide with 0"+e);
		}
		finally {
			System.out.println("exception complete : i will always print");
		}

	}

}
