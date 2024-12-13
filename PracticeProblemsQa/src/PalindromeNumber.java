import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args) {
		int no;
		Scanner sc=new Scanner(System.in);
		System.out.println("check no is palin or not");
		no=sc.nextInt();
		String reverse= new StringBuilder(String.valueOf(no)).reverse().toString();
		int reversedNumber = Integer.parseInt(reverse);
		System.out.println(reversedNumber);
		
		if(no==reversedNumber) {
			System.out.println("it is palindrome");
		}
		else {
			System.out.println("no it is palindrome");

		}

	}

}
