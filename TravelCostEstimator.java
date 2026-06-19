import java.util.Scanner;

public class TravelCostEstimator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Read user inputs
        System.out.print("Enter distance in km: ");
        double distance = input.nextDouble();

        System.out.print("Enter mileage (km/litre): ");
        double mileage = input.nextDouble();

        System.out.print("Enter petrol price: ");
        double petrolPrice = input.nextDouble();

        // Calculate fuel needed and total cost
        double fuelNeeded = distance / mileage;
        double cost = fuelNeeded * petrolPrice;

        // Display results formatted to match the example output
        System.out.println("\nFuel needed = " + (int)fuelNeeded + " litres");
        System.out.println("Cost = " + (int)cost);
    }
}