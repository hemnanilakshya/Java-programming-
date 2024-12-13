import java.util.Scanner;

public class MultipicationTable {

	public static void main(String[] args) {
		int no;
		Scanner sc= new Scanner(System.in); 
		System.out.println("please enter no to print table");
		no=sc.nextInt();	
		
		for(int i=0 ; i<=10;i++) {
			int result=no*i;
			System.out.println(no+no+result);
			
			//123
			//1+2+3=6
		}
	}

}
