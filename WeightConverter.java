import java.util.Scanner;

public class WeightConverter {
    public static void main(String[] args) {
        // Welcome prompt
        System.out.println("Welcome to the weight converter program!");

        // Ask for user input
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter the number of ounces: ");
        int ounces = scanner.nextInt();

        // Confirm input
        System.out.println("You entered " + ounces + " ounces.");

        // Conversion calculations
        int pounds = ounces / 16;
        int remainingOunces = ounces % 16;
        double decimalPounds = ounces / 16.0;

        // Print results
        System.out.println("Converted weight: " + pounds + " lbs and " + remainingOunces + " oz");
        System.out.printf("Decimal pounds: %.2f lbs%n", decimalPounds);

        // Exit message
        System.out.println("Thank you for using the weight converter program. Goodbye!");

        scanner.close();
    }
}
