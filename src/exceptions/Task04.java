package exceptions;

import java.util.Scanner;

// Кастомний виняток
class InvalidNumberException extends Exception {
    public InvalidNumberException(String message) {
        super(message);
    }
}

public class Task04 {

    static Scanner scanner;
    static int number;

    public static void main(String[] args) {

        scanner = new Scanner(System.in);
        System.out.print("Enter number (from -10 to +35, inclusive): ");
        number = scanner.nextInt();

        try {
            // Виклик методу
            validateNumber(number);

        } catch (InvalidNumberException ex) {
            System.out.println("Caught an exception.");
            // Повідомлення кастомного винятку
            System.out.println("An exception has occurred: " + ex);
        }
        System.out.println("Further down the code...");
    }

    // Метод валідації
    static void validateNumber(int number) throws InvalidNumberException {
        if (number >= -10 && number <= 3) {
            System.out.println("OK. Number: " + number);
        } else {
            // Викид кастомного винятку
            throw new InvalidNumberException("\nNumber " + number +
                    " is wrong!");
        }
    }
}
