package practice_1;

import java.util.Arrays;
import java.util.Random;

public class Task12 {
    /**
     * Just bubble sort for your array in descending or ascending order
     * */
    public static void sort(int[] array, boolean isAscendingSort) {
        if (isAscendingSort) {
            for (int i = 1; i < array.length; i++) {
                for (int j = i; j > 0; j--) {
                    if (array[j] < array[j - 1]) {
                        int temp = array[j];
                        array[j] = array[j - 1];
                        array[j - 1] = temp;
                    }
                }
            }
        } else {
            for (int i = 1; i < array.length; i++) {
                for (int j = i; j > 0; j--) {
                    if (array[j] > array[j - 1]) {
                        int temp = array[j];
                        array[j] = array[j - 1];
                        array[j - 1] = temp;
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[10];

        Random rand = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(100);
        }

        System.out.println("Initial array: " + Arrays.toString(arr));

        sort(arr, true);

        System.out.println("Sorted array: " + Arrays.toString(arr));
    }
}
