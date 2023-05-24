package ss14_sort_algorithms.practice.practice_2;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] array = new int[]{12, 2, 4, 23, 3, 5, 10, 1};
        int min;
        int temp;
        for (int i = 0; i < array.length - 1; i++) {
            min = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[min] > array[j]) {
                    min = j;
                }
            }
            if (min != i) {
                temp = array[i];
                array[i] = array[min];
                array[min] = temp;
            }
        }
        System.out.println(Arrays.toString(array));
    }
}
