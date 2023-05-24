package ss13_searching_algorithms.exercise.exercise_2;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        int[] numberArray = new int[]{2, 5, 7, 3, 4, 6, 12, 34, 41, 23, 7, 9, 28, 68};
        Arrays.sort(numberArray);
        System.out.println(Arrays.toString(numberArray));

        System.out.println("Vui lòng nhập số cần tìm! ");
        Scanner sc = new Scanner(System.in);
        int number = Integer.parseInt(sc.nextLine());
        System.out.println(findXinArray(numberArray, 0, numberArray.length - 1, number));
    }

    public static int findXinArray(int[] array, int first, int last, int x) {
        Arrays.sort(array);
        int mid;
        if (first <= last) {
            mid = (first + last) / 2;
            if (x > array[mid]) {
                first = mid + 1;
                return findXinArray(array, first, last, x); // đệ quy nè :v
            } else if (x < array[mid]) {
                last = mid - 1;
                return findXinArray(array, first, last, x);
            } else {
                return mid;
            }
        } else {
            return -1;
        }
    }
}