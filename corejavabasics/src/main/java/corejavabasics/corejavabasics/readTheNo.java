package corejavabasics.corejavabasics;

import java.util.Scanner;

public class readTheNo {

	public static void main(String[] args) {
		int num;
		System.out.println("please enter no");
		Scanner sc= new Scanner(System.in);
		num=sc.nextInt();
		System.out.println("the integer is"+num);
		sc.close();
		

	}

}
