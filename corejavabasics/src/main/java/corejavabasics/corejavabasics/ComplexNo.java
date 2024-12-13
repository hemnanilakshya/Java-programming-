package corejavabasics.corejavabasics;

public class ComplexNo {
	
	int real,imaginary;
	
	public ComplexNo(int real,int imaginary) {
		this.real=real;
		this.imaginary=imaginary;
		
	}
	
	public ComplexNo add(ComplexNo other) {
		int newReal=this.real+other.real;
		int newImaginary=this.imaginary+ other.imaginary;
		return new ComplexNo(newReal,newImaginary);
		
	}
	public void display() {
		System.out.println(this.real+ "+i"+ this.imaginary );
		
	}
	
	
	public static void main(String[] args) {
		ComplexNo no1=new ComplexNo(5,4);
		ComplexNo no2=new ComplexNo(9,4);
		 System.out.print("First Complex Number: ");
	        no1.display();

	        System.out.print("Second Complex Number: ");
	        no2.display();
	        
	        ComplexNo sum=no1.add(no2);
	        System.out.println("sum of complex no is");
	        sum.display();
       
	}

}
