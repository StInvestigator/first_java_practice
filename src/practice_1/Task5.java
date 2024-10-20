package practice_1;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        short monthNumber;

        System.out.print("Enter month number: ");
        Scanner sc = new Scanner(System.in);
        monthNumber = sc.nextShort();

        if (monthNumber < 1 || monthNumber > 12) {
            System.out.println("Invalid month number");
            return;
        }

        if (monthNumber == 1 || monthNumber == 2 || monthNumber == 12) {
            System.out.println("Winter");
        } else if (monthNumber <= 5) {
            System.out.println("Spring");
        } else if (monthNumber <= 8) {
            System.out.println("Summer");
        } else {
            System.out.println("Autumn");
        }
    }
}
