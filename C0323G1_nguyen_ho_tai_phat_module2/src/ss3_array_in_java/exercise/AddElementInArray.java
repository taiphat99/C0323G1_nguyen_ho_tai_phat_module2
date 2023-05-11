package ss3_array_in_java.exercise;

import java.util.Arrays;
import java.util.Scanner;

public class AddElementInArray {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 0, 0, 0, 0, 0, 0};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number u would like to add in the array");
        int number = sc.nextInt();
        System.out.println("Enter index u would like to add " + number + " in the array");
        int index = sc.nextInt();
        for (int i = array.length; i > index+1; i--) {
            array[i-1] = array[i-2];
        }
        array[index] = number;
        System.out.println(Arrays.toString(array));
    }
}
