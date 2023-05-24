package ss14_sort_algorithms.exercise.exercise_2;

import java.util.Arrays;

public class InstallInsertionSort {
    public static void main(String[] args) {
        int[] array = {5, 10, 15, 4, 11, 7, 8, 3, 1};
        System.out.println(Arrays.toString(insertionSort(array)));
    }

    public static int[] insertionSort(int[] array) {
        int x;
        int post;
        for (int i = 1; i < array.length; i++) {
            x = array[i];
            post = i;
            while (post > 0 && x < array[post - 1]) {
                array[post] = array[post - 1];
                post--;
            }
            array[post] = x;
        }
        return array;
    }
}
