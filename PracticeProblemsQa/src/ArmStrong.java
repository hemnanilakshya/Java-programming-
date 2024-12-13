import java.util.Scanner;

public class ArmStrong {

	public static void main(String[] args) {
			int num;
			Scanner sc=new Scanner(System.in);
			System.out.println("please enter valid no");
			num=sc.nextInt();
			int originalnum=num;
			
			int n=0 ; int sum=0;
			
			int temp=num;
			while(temp!=0) {   // ---this if for counting no's
				temp/=10;
				n++;
			}
			
			while(num!=0) {
				int digit = num % 10; 
				sum+=Math.pow(digit, n);
				num/=10;	
				
			}
			
			if(num==originalnum) {
				System.out.println("it is armstrong"+ num);
			}
			else
			{
				System.out.println("it is not an armstrong"+ num);

			}
			
	}

}
