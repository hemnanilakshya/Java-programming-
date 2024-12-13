import java.util.Scanner;

public class areaOfRec {

	public static void main(String[] args) {
		int length,width,area;
		Scanner sc= new Scanner(System.in);
		System.out.println("please enter length");
		length=sc.nextInt();
		System.out.println("please enter breath");
		width=sc.nextInt();
		
		area= length*width;
		System.out.println("Area of rectangle is:"+area);
		

	}

}
