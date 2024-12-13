import java.util.Scanner;

public class LargestOf3No {

	public static void main(String[] args) {
			int no1,no2,no3;
			
			Scanner sc=new Scanner(System.in);
			System.out.println("enter no1");
			no1=sc.nextInt();
			System.out.println("enter no2");
			no2=sc.nextInt();
			System.out.println("enter no3");
			no3=sc.nextInt();
			
			if(no1>no2 && no1>no3) {
				System.out.println("no1 you are bigger "+no1 +"than" + no2 + no3);
				
			}
			else if(no2>no1 && no2>no3) {
				System.out.println("no2 you are bigger "+no2+"than" + no1 + no3);
			}
			else
			{
				System.out.println("no3 you are bigger "+no3 +  "than" + no1 +  no2);
			}
	}

}
