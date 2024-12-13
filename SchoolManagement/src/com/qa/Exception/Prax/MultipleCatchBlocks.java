package com.qa.Exception.Prax;

public class MultipleCatchBlocks {

	public static void main(String[] args) {
			try {
				int[]numbers= {1,2,3,4};
				 System.out.println(numbers[5]);
				int result=10/0;
					
			}
			catch(ArrayIndexOutOfBoundsException e) {
				System.out.println("index bound error"+e);
				
			}
			catch(ArithmeticException e) {
				System.out.println("cant divide with 0"+e);
			}
			catch(Exception e) {
				System.out.println("basic exception"+e);
			}
	}

}
