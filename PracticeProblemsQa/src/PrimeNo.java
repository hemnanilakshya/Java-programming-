public class PrimeNo {

	public static void main(String[] args) {
		
		for(int num=2 ; num<51; num++) {
			boolean isprime=true;
			
			for(int i=2; i<=num/2;i++) {
				if(num%i==0) {
					isprime=false;
					break;
				}
			}
			
			if(isprime) {
				System.out.println(num+"primeno");
			}
		}
	}

}
