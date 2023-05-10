package ss3_array_in_java.exercise;

import java.util.Arrays;
import java.util.Scanner;

public class SumOfElementsInADiagonalLine {
    public static void main(String[] args) {
        int[][] array = new int[3][3];
        Scanner sc = new Scanner(System.in);
        int count = 1;
        int sum = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("Enter element " + count);
                array[i][j] = sc.nextInt();
                count++;
            }
        }
        System.out.println(Arrays.deepToString(array));

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (i == j || i + j == 2) {
                    sum += array[i][j];
                    if (i == j && i + j == 2) {
                        sum += array[i][j];
                    }
                }
            }
        }
        System.out.println("Sum = " + sum);
    }
}
