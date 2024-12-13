package corejavabasics.corejavabasics;

import java.util.Scanner;

public class ArmStrong {

    public static void main(String[] args) {
        int ub, lb;
        Scanner sc = new Scanner(System.in);

        // Take the lower and upper bounds as input
        System.out.println("Enter lower bound:");
        lb = sc.nextInt();
        System.out.println("Enter upper bound:");
        ub = sc.nextInt();

        // Check if the lower bound is greater than the upper bound
        

        // Loop through the range
        for (int num = lb; num <= ub; num++) {
            int originalnum = num; // Preserve the original number
            int sum = 0;
            int digits = 0;
            int temp = num; // Use temp to preserve the value of num

            // Count the number of digits in the number
            while (temp != 0) {
                temp /= 10;
                digits++;
            }

            temp = originalnum; // Reset temp back to original value

            // Calculate the Armstrong sum of powers of digits
            while (temp != 0) {
                int digit = temp % 10;  // Extract the last digit
                sum += Math.pow(digit, digits); // Add the digit raised to the power of digits
                temp /= 10;  // Remove the last digit
            }

            // Check if sum equals the original number
            if (sum == originalnum) {
                System.out.println(originalnum + " is an Armstrong number.");
            }
        }

        sc.close(); // Close the scanner
    }
}
