package corejavabasics.corejavabasics;

import java.util.Scanner;

public class LCM {
	public static int gcd(int a, int b) {
		while(b!=0) {
			int temp=b;
			b=a%b;
			a=temp;
		}
		
		return a;
	}
	public static int lcm(int a , int b) {
		return (a*b)/gcd(a,b);
	}
	

	public static void main(String[] args) {
		//LCM(a,b)= |a*b|GCD(a,b)
		
		Scanner sc= new Scanner(System.in);
		System.out.println("please enter first no : ");
		int no1=sc.nextInt();
		
		System.out.println("please enter second no:");
		int no2=sc.nextInt();
		
		int gcdres=gcd(no1,no2);
		int result=lcm(no1,no2);
		System.out.println(result);
		System.out.println(gcdres);
		sc.close();
		
		
		

	}

}
