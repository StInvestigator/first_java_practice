package practice_1;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        double meters;
        double result;
        char flag;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter meters: ");
        meters = scanner.nextDouble();

        System.out.println("Convert meters to (enter the character that corresponds to your choice):\nmiles - m\ninches - i\nyards - y");
        flag = scanner.next().trim().charAt(0);

        switch (flag) {
            case 'm':
                result = meters * 0.00062137;
                break;
            case 'i':
                result = meters * 39.36;
                break;
            case 'y':
                result = meters * 1.0936;
                break;
            default:
                System.out.print("Wrong input!");
                return;
        }
        System.out.print("The result is " + result);
    }
}
