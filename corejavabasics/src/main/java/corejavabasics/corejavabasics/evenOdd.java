package corejavabasics.corejavabasics;

import java.util.Scanner;

public class evenOdd {

	public static void main(String[] args) {
		
		int no;
		Scanner sc=new Scanner(System.in);
		System.out.println("please enter any no to check odd or even");
		no=sc.nextInt();
		
		
		if(no%2==0) {
			System.out.println("this is even no " +no );
		}
		else {
			System.out.println("this is odd no " +no);
		}
		

	}

}
