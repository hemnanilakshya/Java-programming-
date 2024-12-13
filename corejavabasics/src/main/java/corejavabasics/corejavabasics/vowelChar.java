package corejavabasics.corejavabasics;

import java.util.Scanner;

public class vowelChar {

	
	public static void main(String[] args) {
		char vow;
		Scanner sc= new Scanner(System.in);
		System.out.println("enter single char");
	String	input=sc.nextLine();
	
	if (input.length() != 1) {
        System.out.println("Invalid input. Please enter a single character.");
        return; 
    }
	vow=input.toLowerCase().charAt(0);
		
		if(vow=='a'|| vow=='e' || vow=='i' ||vow=='o'|| vow=='u') {
			System.out.println(vow+"vowel yes");
			
		}
		else
		{
			System.out.println(vow+" vowel no");
		}

	}

}
