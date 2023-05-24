package ss14_sort_algorithms.practice.practice_1;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {

        int[] numberArray = new int[]{12, 2, 4, 23, 3, 5, 3, 1};
        int temp;
        for (int i = 0; i < numberArray.length - 1; i++) {
            for (int j = numberArray.length - 1; j > i; j--) {
                if (numberArray[j] < numberArray[j - 1]) {
                    temp = numberArray[j - 1];
                    numberArray[j - 1] = numberArray[j];
                    numberArray[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(numberArray));
    }
}
