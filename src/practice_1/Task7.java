package practice_1;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        int num1, num2;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        num1 = scanner.nextInt();
        System.out.print("Enter second number: ");
        num2 = scanner.nextInt();

        if (num1 > num2) {
            int tmp = num1;
            num1 = num2;
            num2 = tmp;
        }

        System.out.print("Odd numbers between " + num1 + " and " + num2 + ": ");
        for (int i = ((num1 % 2 != 0) ? num1 : (num1 + 1)); i <= num2; i += 2) {
            System.out.print(i +" ");
        }
    }
}
