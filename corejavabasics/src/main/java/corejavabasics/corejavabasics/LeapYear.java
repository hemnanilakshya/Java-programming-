package corejavabasics.corejavabasics;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
			//leap year
		
		int year;
		Scanner sc= new Scanner(System.in);
		System.out.println("enter a  valid year");
		year = sc.nextInt();
		if((year%4==0 && year%100!=0)||year%400==0){
			System.out.println("leap");
		}
			else {
				System.out.println(" no leap");

			}
			
		}
	}


