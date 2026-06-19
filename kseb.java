import java.util.Scanner;

public class kseb {

    public static void main(String[] args) {

        try (Scanner input = new Scanner(System.in)) {
            final double RATE_PER_UNIT = 7.5;

            int units;
            double billAmount;

            System.out.print("Enter units consumed: ");
            units = input.nextInt();

            billAmount = units * RATE_PER_UNIT;

            System.out.println("Electricity Bill = " + billAmount);
        }
    }
}
