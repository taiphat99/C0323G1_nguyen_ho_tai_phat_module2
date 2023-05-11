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
                    sum += array[i][2-i];
                    sum += array[i][i];
                }
        System.out.println("Sum = " + sum);
    }
}
