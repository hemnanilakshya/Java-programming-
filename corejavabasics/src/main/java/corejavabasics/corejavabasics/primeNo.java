package corejavabasics.corejavabasics;

import java.util.Scanner;

public class primeNo {

	public static void main(String[] args) {
				int n;
				Scanner s= new Scanner(System.in);
				System.out.println("enter n0");
				n=s.nextInt();
				
				
				// <=1==0 not a prime %2 not a prime
				
				if(isprime(n)) {
					System.out.println(n+"is a prime");
				}
				else {
					System.out.println(n+"is not a prime");
				}
	}
				public static boolean isprime(int n) {
					if(n<=1) {
						return false;
					}
					for(int i=2 ; i<n ; i++) {
						if(n%2==0) {
							return false;
						}
					}
					
					return true;
					
				}
				
	}


