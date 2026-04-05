// 39.2.4 RangeValidator.java
import java.util.Scanner;

// Define a custom exception class InvalidRangeException
class InvalidRangeException extends Exception {
    public InvalidRangeException(String message) {
        super(message);
    }
}

public class RangeValidator {

    // Method to validate the range
    public static void validateRange(int number, int maxValue) throws InvalidRangeException {
        // Throws InvalidRangeException if the number is greater than the maxValue
        if (number > maxValue) {
            // If the number is greater than maxValue, throw InvalidRangeException with an
            // error message
            throw new InvalidRangeException("Number greater than the maximum value");
        }
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Number: ");
        int number = scanner.nextInt();

        System.out.print("Maximum value: ");
        int maxValue = scanner.nextInt();

        try {
            validateRange(number, maxValue);
            System.out.println("Number " + number + " is within the valid range");
        } catch (InvalidRangeException e) {
            System.out.println(e.getMessage());
        }
    }
}