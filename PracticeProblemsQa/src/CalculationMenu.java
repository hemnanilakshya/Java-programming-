import java.util.Scanner;

public class CalculationMenu {

	public void menu(int option, double no1, double no2) {
		double result;
		switch (option) {
		case 1:
			result = no1 + no2;
			System.out.println("Result of Addition is " + result);
			break;
		case 2:
			result = no1 - no2;
			System.out.println("Result of Subtraction is " + result);
			break;
		case 3:
			result = no1 * no2;
			System.out.println("Result of Multiplication is " + result);
			break;
		case 4:

			result = no1 / no2;
			System.out.println("Result of divison is " + result);

			break;
		default:
			System.out.println("Invalid option.");
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		CalculationMenu calc = new CalculationMenu();
		System.out.println("Enter first number:");
		double no1 = sc.nextDouble();
		System.out.println("Enter second number:");
		double no2 = sc.nextDouble();
		System.out.println("Enter your choice (1-4):");
		int option = sc.nextInt();
		calc.menu(option, no1, no2);
		sc.close();
	}
}
