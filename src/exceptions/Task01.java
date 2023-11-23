package exceptions;

import java.util.Scanner;

public class Task01 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter number: ");
            String input = scanner.nextLine();

            // Попытка преобразования введенной строки в число
            int number = Integer.parseInt(input);

            // Вывод результата
            System.out.println("Number is: " + number);

        } catch (NumberFormatException nfe) {
            // Обробка винятку
            System.out.println("Exception: " + nfe);
        }
        finally {
            scanner.close();
        }

        System.out.println("Further down the code...");
    }
}