import java.util.Scanner;

public class InputValidator {

    public static int getValidatedInput(int lowerBound, int upperBound, String prompt, String errorMessage) {
        Scanner scanner = new Scanner(System.in);
        int input;

        while (true) {
            System.out.print(prompt);
            if (scanner.hasNextInt()) {
                input = scanner.nextInt();
                if (input >= lowerBound && input <= upperBound) {
                    break;
                } else {
                    System.out.println(errorMessage);
                }
            } else {
                System.out.println(errorMessage);
                scanner.next(); // Clear the invalid input
            }
        }

        return input;
    }

    public static void main(String[] args) {
        // Example usage
        int lowerBound = 0;
        int upperBound = 100;
        String prompt = "Please enter a number between 0 and 100: ";
        String errorMessage = "Invalid input. Please enter a number between 0 and 100.";

        int validatedInput = getValidatedInput(lowerBound, upperBound, prompt, errorMessage);
        System.out.println("The value entered by the user is: " + validatedInput);
    }
}
