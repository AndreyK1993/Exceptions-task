package exceptions;

import java.util.Scanner;

public class Task02 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        try {
            // Задаем массив цен на товарной бирже за 5 дней
            double[] prices = {100.0, 105.5, 98.2, 102.8, 110.3};

            System.out.print("Enter the index to get the price: ");

            // Попытка преобразования введенной строки в число
            int index = scanner.nextInt();

            // Обработка ввода индекса и вывод цены
            if (index >= 0 && index < prices.length) {
                System.out.println("Price at index " + index + ": " + prices[index]);
            } else {
                System.out.println("Invalid index. Please enter a valid index within the array bounds.");
            }

        } catch (ArithmeticException e) {
            // Обробка винятку
            System.out.println("ArithmeticException has occurred." + e);

        } catch (ArrayIndexOutOfBoundsException e) {
            // Обробка винятку
            System.out.println("ArrayIndexOutOfBoundsException has occurred." + e);

        } catch (Exception e) {
            System.out.println("Exception has occurred.");

        } finally {
            scanner.close();
        }

        System.out.println("Further down the code...");
    }
}