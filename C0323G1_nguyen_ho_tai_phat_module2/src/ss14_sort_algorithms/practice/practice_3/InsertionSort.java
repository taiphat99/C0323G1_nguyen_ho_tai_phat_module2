package ss14_sort_algorithms.practice.practice_3;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] array = new int[]{5, 10, 15, 4, 11, 7, 8, 3, 1};
        int x;
        int post;
        for (int i = 1; i < array.length ; i++) {
            x = array[i];
            post = i;
            while(post >0 && x < array[post-1]){
                array[post] = array[post -1];
                post--;
            }
            array[post] = x;
        }
        System.out.println(Arrays.toString(array));
    }
}
