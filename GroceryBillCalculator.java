import java.util.Scanner;

public class GroceryBillCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Constant baseline definition (10% discount)
        final double DISCOUNT = 0.10;

        // Read prices of the three items
        System.out.print("Enter price of item 1: ");
        double item1 = input.nextDouble();

        System.out.print("Enter price of item 2: ");
        double item2 = input.nextDouble();

        System.out.print("Enter price of item 3: ");
        double item3 = input.nextDouble();

        // Calculate total sum of items
        double total = item1 + item2 + item3;

        // Calculate discount amount
        double discountAmount = total * DISCOUNT;

        // Calculate final payable amount
        double finalAmount = total - discountAmount;

        // Displaying output formatted as whole numbers to match the example
        System.out.println("\nTotal = " + (int)total);
//        System.out.println("\nTotal = " + total);

        System.out.println("Discount = " + (int)discountAmount);
        System.out.println("Final Amount = " + (int)finalAmount);
    }
}