import java.util.Scanner;

public class PalindromeString {

	public static void main(String[] args) {
			String word;
			Scanner sc= new Scanner(System.in);
			System.out.println("enter word to check it is palindrome or not");
			word=sc.nextLine();
			
			String palinword=new StringBuilder(word).reverse().toString();
			System.out.println(palinword);
			if(word.equals(palinword)) {
				System.out.println("it is palindrome");
			}
			else {
				System.out.println("not a palindrome");
			}
			
		

	}

}
