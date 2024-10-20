package practice_1;

import java.util.Arrays;
import java.util.Random;

public class Task9 {
    public static void main(String[] args) {
        int[] arr = new int[10];
        Random rand = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(-10, 10);
        }

        System.out.println("Initial array: " + Arrays.toString(arr));

        int min = arr[0];
        int max = arr[0];
        int negativeCount = 0;
        int positiveCount = 0;
        int zeroCount = 0;

        for (int item : arr) {

            if (item < min) {
                min = item;
            } else if (item > max) {
                max = item;
            }

            if (item < 0) {
                negativeCount++;
            } else if (item > 0) {
                positiveCount++;
            } else {
                zeroCount++;
            }
        }

        System.out.println("min = " + min);
        System.out.println("max = " + max);
        System.out.println("negative numbers count = " + negativeCount);
        System.out.println("positive numbers count = " + positiveCount);
        System.out.println("zero count = " + zeroCount);

    }
}
