package exceptions;

import java.util.Scanner;

public class Task03 {

    static double funds = 100500;
    static String currency = "EUR";

    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter the amount to pay in " + currency + ": ");
            validate(scanner.nextDouble());
            System.out.println("Payment successful.");
        } catch (Exception e) {
            System.out.println("Payment failed. " + e.getMessage());
        }

        System.out.println("Further down the code...");
    }
    public static void validate(double amountToPay) {
        if (amountToPay > funds) {
            // Виняток, що викидується
            throw new ArithmeticException("Insufficient funds!");
        } else {
            System.out.println("Payment is OK!");
        }
    }
}