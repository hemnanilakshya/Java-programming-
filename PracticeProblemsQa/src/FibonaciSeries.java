
public class FibonaciSeries {

	public static void main(String[] args) {
			int fno=0;
			int lno=1;
			int sum=0;
			for(int i=1 ;i<=100;i++) {
				sum=fno+lno;
				fno=lno;
				lno=sum;
				if(sum>100) {
					break;
				}
				System.out.println(sum);

			}
			
	}

}
