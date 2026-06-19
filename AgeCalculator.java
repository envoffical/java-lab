import java.util.Scanner;

public class AgeCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter current year: ");
        int currentYear = input.nextInt();
        System.out.print("Enter birth year: ");
        int birthYear = input.nextInt();
        int age = currentYear - birthYear;
        System.out.println("Age = " + age);
    }
}