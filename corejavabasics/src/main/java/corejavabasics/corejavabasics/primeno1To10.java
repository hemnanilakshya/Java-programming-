package corejavabasics.corejavabasics;

import java.util.Scanner;

public class primeno1To10 {

	public static void main(String[] args) {
		
//		Scanner sc= new Scanner(System.in);
//		System.out.println("enter nos");
//		n=sc.nextInt();
		
		for(int i=1; i<=10;i++) {
			if(isprime(i)) {
				System.out.println(i+"prime no");
			}
		}
	}
			public static boolean isprime(int n) {
				if(n<=1) {
					return false;
				}
				
				for(int i=2; i<=Math.sqrt(n) ; i++) {
					if(n%i==0) {
						return false;
						
					}
					
				}
				return true;
			}
		
	
}
