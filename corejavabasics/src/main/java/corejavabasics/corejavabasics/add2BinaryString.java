package corejavabasics.corejavabasics;

public class add2BinaryString {

    // Method to add two binary strings
    static String add_binary(String x, String y) {
        try {
            // Convert binary strings to integers
            int num1 = Integer.parseInt(x, 2);
            int num2 = Integer.parseInt(y, 2);

            // Add the two integers
            int sum = num1 + num2;

            // Convert the sum back to a binary string
            return Integer.toBinaryString(sum);

        } catch (NumberFormatException e) {
            return "Invalid binary input. Please provide valid binary strings.";
        }
    }

    public static void main(String[] args) {
        // Valid binary strings
        String x = "1010"; // Binary for 10
        String y = "1101"; // Binary for 13

        // Add and print the result
        System.out.println("Result of binary addition: " + add_binary(x, y));
    }
}
