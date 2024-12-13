package corejavabasics.corejavabasics;

import java.util.Scanner;

public class neonNo {
	
	public static boolean Checkneon(int n) {
		
		int square=n*n;
		int sum=0;
		while(square>0) {
			int r=square%10;
			sum=sum+r;
			square=square/10;
			
		}
		if(sum==n) {
			return true;
		}
		else {
			return false;
		}
	}
		public static void main(String[]args) {
			int n;
		Scanner sc= new Scanner(System.in);
		System.out.println("check no is neon no or not");
		n=sc.nextInt();
		
		if(Checkneon(n)) {
			System.out.println(n +  "it is neon no");
		}
		else {
			System.out.println(n+"it is not an neon no");
		}
	}

}
