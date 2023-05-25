package ss15_exception_and_debug.practice.practice_1;

import java.util.Random;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();
        Integer[] arr = new Integer[50];
        System.out.println("Number Array Elements: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rd.nextInt(50);
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        do {
            System.out.println("Enter index here: ");
            try {
                int index = Integer.parseInt(sc.nextLine());
                System.out.println("The value of index " + index + " is " + arr[index]);
                break;
            } catch (IndexOutOfBoundsException e) {
                System.out.println("This index is out of bounds of the Array!");
            }
        } while (true);

    }
}
