package corejavabasics.corejavabasics;

import java.util.Scanner;

public class swap2No {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("please enter value for m");
		
		System.out.println("please enter value for n");
		int m=sc.nextInt();
		int n=sc.nextInt();
		
	if(m!=n) {
		int temp=m;
		m=n;
		n=temp;
		
	}
	System.out.println("After swapping: m = " + m + ", n = " + n);	
	
		
		
	}

}
