package practice_1;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        double number;
        double percentage;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number: ");
        number = scanner.nextDouble();
        System.out.print("Enter percentage: ");
        percentage = scanner.nextDouble();

        // The result is calculated with an accuracy of 2 digits after the decimal point
        // To avoid outputs like 0.10000000000001
        System.out.println("The result is " + Math.round(number * percentage) / 100.);
    }
}
