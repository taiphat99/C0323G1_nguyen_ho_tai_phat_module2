package ss3_array_in_java.exercise;

import java.util.Arrays;
import java.util.Scanner;

public class SumOfElementsOfAColumn {
    public static void main(String[] args) {
        float[][] array = new float[3][3];
        Scanner sc = new Scanner(System.in);
        int count = 1;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("Enter element " + count);
                array[i][j] = sc.nextFloat();
                count++;
            }

        }
        System.out.println(Arrays.deepToString(array));

        System.out.println("What column u would like to sum all the elements");
        int column = sc.nextInt();
        int sum = 0;
        for (int i = 0; i < 3; i++) {
            sum += array[i][column];
        }
        System.out.println("Sum = " + sum);
    }
}
