package practice_1;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        String number;
        String result;
        char tmp;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the 6-digit number: ");
        number = scanner.nextLine();

        if(number.length()!=6){
            System.out.println("Invalid number");
            return;
        }

        char[] chars = number.toCharArray();

        tmp = chars[0];
        chars[0] = chars[5];
        chars[5] = tmp;

        tmp = chars[1];
        chars[1] = chars[4];
        chars[4] = tmp;

        result = new String(chars);

        System.out.println("Number after swapping 1 and 2 with 6 and 5 positions respectfully - " + result);
    }
}
