package corejavabasics.corejavabasics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class inputFromUser {

	public static void main(String[] args) throws IOException {
		BufferedReader reader= new BufferedReader(new InputStreamReader(System.in));
	String name=reader.readLine();
	System.out.println(name);
		
	Scanner sc = new Scanner(System.in);
	String s=sc.nextLine();
	System.out.println("you entered this string"+ s);
	
	int no1=sc.nextInt();
	System.out.println("this is num1 ="+no1);
	
	int no2=sc.nextInt();
	System.out.println("this is num2 ="+no2);
	
	
	String name1 = System.console().readLine();
	System.out.println("You entered: " + name1);

	
	
	
	
	

	}

}
