import java.util.Scanner;

public class DataUsageCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Constant baseline definition
        final double DATA_LIMIT = 30.0;

        // Read data usage variable from the user
        System.out.print("Enter data used in GB: ");
        double usedData = input.nextDouble();

        // Subtraction expression and assignment
        double remainingData = DATA_LIMIT - usedData;

        // Displaying output formatted as whole numbers to match the example
        System.out.println("\nUsed: " + (int)usedData + " GB");
        System.out.println("Remaining: " + (int)remainingData + " GB");
    }
}