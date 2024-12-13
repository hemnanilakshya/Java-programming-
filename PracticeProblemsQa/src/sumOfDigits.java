import java.util.Scanner;

public class sumOfDigits {

	public static void main(String[] args) {
		int n;
		int sum=0;
		Scanner sc= new Scanner(System.in);
		System.out.println("enter any digits");
		n=sc.nextInt();
		//12345 1+2+3+4+5=15
		while(n!=0) {
			int digit = n % 10; 
            sum += digit; 
            n = n / 10; 
		
		}
		System.out.println("sum of no is:" + sum);
		
		

	}

}
