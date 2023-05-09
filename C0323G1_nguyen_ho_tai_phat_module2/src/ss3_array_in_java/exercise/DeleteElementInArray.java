package ss3_array_in_java.exercise;

import java.util.Arrays;
import java.util.Scanner;

public class DeleteElementInArray {
    public static void main(String[] args) {
        int[] array = {1, 2, 2, 2, 5, 6, 7, 8, 9, 10};
        System.out.println("Enter the number that you would like to delete: ");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        for (int i = 0; i < array.length; i++) {
            if (number == array[i]) {
                for (int j = i; j < array.length - 1; j++) {
                    array[j] = array[j + 1];
                }
                i--;
                array[array.length - 1] = 0;
            }
        }
        System.out.println(Arrays.toString(array));
    }
}
