import java.util.Scanner;

public class SimpleInterestCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Define the fallback constant rate
        final double DEFAULT_RATE = 5.0;

        // Read Principal Amount
        System.out.print("Enter Principal amount: ");
        double principal = input.nextDouble();

        // Read Time
        System.out.print("Enter Time (in years): ");
        double time = input.nextDouble();
        
        // Consume the leftover newline character in the buffer
        input.nextLine(); 

        // Read Rate of Interest as a string to check if it's left blank
        System.out.print("Enter Rate of Interest (Press Enter to use default 5.0%): ");
        String rateInput = input.nextLine().trim();

        double rate;
        // If the user didn't type anything, assign the default rate
        if (rateInput.isEmpty()) {
            rate = DEFAULT_RATE;
        } else {
            rate = Double.parseDouble(rateInput);
        }

        // Calculate Simple Interest using the formula
        double si = (principal * rate * time) / 100;

        // Display the output
        System.out.println("\nInterest = " + (int)si);
    }
}