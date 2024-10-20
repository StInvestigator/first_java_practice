package practice_1;

import java.util.Arrays;
import java.util.Random;

public class Task10 {
    public static void main(String[] args) {
        int[] arr = new int[10];

        Random rand = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(-10, 10);
        }

        System.out.println("Initial array: " + Arrays.toString(arr));

        int evenCount = 0;
        int negativeCount = 0;
        int positiveCount = 0;

        for (int item : arr) {

            if (item % 2 == 0) {
                evenCount++;
            }

            if (item < 0) {
                negativeCount++;
            } else if (item > 0) {
                positiveCount++;
            }
        }

        int[] oddSubArray = new int[arr.length-evenCount];
        int[] evenSubArray = new int[evenCount];
        int[] negativeSubArray = new int[negativeCount];
        int[] positiveSubArray = new int[positiveCount];

        int oddIndex = 0, evenIndex = 0, negativeIndex = 0, positiveIndex = 0;

        for (int item : arr) {

            if (item % 2 == 0) {
                evenSubArray[evenIndex++] = item;
            } else {
                oddSubArray[oddIndex++] = item;
            }

            if (item < 0) {
                negativeSubArray[negativeIndex++] = item;
            } else if (item > 0) {
                positiveSubArray[positiveIndex++] = item;
            }
        }

        System.out.println("Odd numbers array: " + Arrays.toString(oddSubArray));
        System.out.println("Even numbers array: " + Arrays.toString(evenSubArray));
        System.out.println("Negative numbers array: " + Arrays.toString(negativeSubArray));
        System.out.println("Positive numbers array: " + Arrays.toString(positiveSubArray));

    }
}
