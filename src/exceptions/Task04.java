package exceptions;

import java.util.Scanner;

// Кастомный виняток
class InvalidTemperatureException extends Exception {
    public InvalidTemperatureException(String message) {
        super(message);
    }
}

public class Task04 {

    static Scanner scanner;
    static int temperature;

    public static void main(String[] args) {

        scanner = new Scanner(System.in);
        System.out.print("Enter the current temperature (from -10 to +35, inclusive): ");
        temperature = scanner.nextInt();

        try {
            // Виклик методу
            validateTemperature(temperature);
            System.out.println("The device is operating within the temperature range.");

        } catch (InvalidTemperatureException ex) {
            // Повідомлення кастомного винятку
            System.out.println("Temperature out of range: " + ex);
        } finally {
            scanner.close();
        }

        System.out.println("Further down the code...");
    }

    // Метод валідації
    static void validateTemperature(int temperature) throws InvalidTemperatureException {
        if (temperature >= -10 && temperature <= 35) {
            System.out.println("OK. Temperature: " + temperature);
        } else {
            // Викид кастомного винятку
            throw new InvalidTemperatureException("\nTemperature " + temperature +
                    " is out of range!");
        }
    }
}
