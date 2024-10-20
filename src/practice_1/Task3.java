package practice_1;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        short num1, num2, num3;
        short result;
        String input;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the 3 numbers separated by commas: ");
        input = sc.nextLine();

        String[] numbers = input.split(",");
        num1 = Short.parseShort(numbers[0].trim());
        num2 = Short.parseShort(numbers[1].trim());
        num3 = Short.parseShort(numbers[2].trim());

        result = (short)(num1*100 + num2*10 + num3);
        System.out.println("The result is " + result);
    }
}
