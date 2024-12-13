package corejavabasics.corejavabasics;

import java.util.Scanner;

public class Gcd {
	
	public static int gcd(int a , int b) {
		while(b!=0) {
			int temp=b;
			b=a%b;
			a=temp;
		}
		return a;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int no1,no2;
		System.out.println("Enter first no");
		no1=sc.nextInt();
		System.out.println("Enter second no");
		no2=sc.nextInt();
		
		int result=gcd(no1,no2);
		
		System.out.println(result);
		
		
		
		
		

	}

}
