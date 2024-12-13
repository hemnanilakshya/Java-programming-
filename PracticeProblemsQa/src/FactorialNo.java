import java.util.Scanner;

public class FactorialNo {

	public static void main(String[] args) {
		int no;
		int factorial=1;
		Scanner sc=new Scanner(System.in);
		System.out.println("please enter no");
		no=sc.nextInt();
		
		for(int i=no; i>=1;i--) {
			factorial*=i;
				
		}
		System.out.println(factorial);
		
			
	}

}
