package ss14_sort_algorithms.exercise.exercise_1;

import java.util.Arrays;

public class IllustrateInsertionSort {
    public static void main(String[] args) {
        int[] array = new int[]{5, 10, 15, 4, 11, 7, 8, 3, 1};
        int x;
        int post;
        System.out.println(Arrays.toString(array));
        for (int i = 1; i < array.length ; i++) {
            System.out.println("----------------------- \n" +
                    "<Loop " + i + '>');
            x = array[i];
            System.out.println("x = " + x);
            post = i;
            System.out.println("post = " + post);
            while(post >0 && x < array[post-1]){
                array[post] = array[post -1];
                post--;
            }
            array[post] = x;
            System.out.println(Arrays.toString(array));
        }
        System.out.println(Arrays.toString(array));
    }
}
