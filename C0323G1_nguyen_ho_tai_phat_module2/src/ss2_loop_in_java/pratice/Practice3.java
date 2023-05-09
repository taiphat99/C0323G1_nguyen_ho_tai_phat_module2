package ss2_loop_in_java.pratice;

import java.util.Scanner;

public class Practice3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a:");
        int a = sc.nextInt();
        System.out.println("Enter b:");
        int b = sc.nextInt();
        System.out.println("Enter c:");
        int c = sc.nextInt();
        int greatestCommonFactor = 0;
        int minimum;

        if (a == 0 || b == 0 || c == 0) {
            System.out.println("No greatest common factor");
        } else {
            if (a < b && a < c) {
                minimum = a;
            } else if (b < c) {
                minimum = b;
            } else {
                minimum = c;
            }
            for (int i = 1; i <= minimum; i++) {
                if (a % i == 0 && b % i == 0 && c % i == 0) {
                    greatestCommonFactor = i;
                }
            }
            System.out.println("The greatest common factor is: " + greatestCommonFactor);
        }
    }
}
