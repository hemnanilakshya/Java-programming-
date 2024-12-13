import java.util.Scanner;

public class vote {

	public static void main(String[] args) {
		int age;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a age i will tell u you are eligible to vote or not");
		age=sc.nextInt();
		if(age>=18 && age<=100) {
			System.out.println("YOU ARE ELIGIBLE "+age);
		}
		else if(age<18) {
			System.out.println("YOU ARE KIDDO "+age);
		}
		else {
			System.out.println("wrong age "+age);
		}
		
		
		

	}

}
