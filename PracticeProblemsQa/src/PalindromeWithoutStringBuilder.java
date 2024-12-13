import java.util.Scanner;

public class PalindromeWithoutStringBuilder {

	public static void main(String[] args) {
		int no;
		int reverse=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("check no is palin or not");
		no=sc.nextInt();
		
		int originalno=no;
		while(no!=0) {
			int digit = no % 10; 
           reverse= reverse*10+digit;
            no = no / 10; 
		
		}
		System.out.println(reverse);
		
		if(originalno==reverse) {
			System.out.println("yes palindrome");
		}
		else {
			System.out.println("no palindrome");
		}
		
		
		
		
		
		
	
		
		
		

	}

}
