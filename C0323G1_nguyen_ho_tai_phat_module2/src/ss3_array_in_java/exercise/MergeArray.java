package ss3_array_in_java.exercise;

import java.util.Arrays;

public class MergeArray {
    public static void main(String[] args) {
        int[] finalArray = new int[10];
        int[] firstArray = {1, 2, 3, 4, 5};
        int[] secondArray = {6, 7, 8, 9, 10};
        for (int i = 0; i < firstArray.length; i++) {
            finalArray[i] = firstArray[i];
        }
        for (int j = 0; j < secondArray.length; j++) {
            finalArray[firstArray.length + j] = secondArray[j];
        }
        System.out.println(Arrays.toString(finalArray));
    }
}
