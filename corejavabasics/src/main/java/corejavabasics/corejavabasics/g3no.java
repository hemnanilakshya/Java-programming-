package corejavabasics.corejavabasics;

import java.util.Scanner;

public class g3no {

	public static void main(String[] args) {
		int a;
		int b;
		int c;
		Scanner sc= new Scanner(System.in);
		System.out.println("please enter no1");
		System.out.println("please enter no2");
		System.out.println("please enter no3");
		
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		
		if(a>b && a>c) {
			System.out.println(a + "A is greater than "+ b  + c);
		}
		else if(b>a && b>c) {
			System.out.println(b+"b is greater than "+ a + c);
			
		}
		else if(c>a && c>b) {
			System.out.println(c+"b is greater than "+ a + b);
		}
		else {
			System.out.println("equal");
		}
	}

}
