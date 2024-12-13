import java.util.Random;
import java.util.Scanner;

public class FlipTheCoin {

	public static void main(String[] args) {
		int numflips;
		Scanner sc=new Scanner(System.in); 
		System.out.println("how many times you want to flip a coin???");
		numflips=sc.nextInt();
		Random rand=new Random();
		for(int i=1;i<numflips;i++) {
	int result=rand.nextInt(2);
	
	if(result==0) {
		System.out.println("heads"+result );
	}
	
	else {
		System.out.println("tails"+result);
	}
			
		}
	}

}
