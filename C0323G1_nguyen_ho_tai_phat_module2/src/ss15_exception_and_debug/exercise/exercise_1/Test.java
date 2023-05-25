package ss15_exception_and_debug.exercise.exercise_1;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        do {
            try {
                float a;
                do {
                    System.out.print("Vui lòng nhập độ dài cạnh a: ");
                    try {
                        a = Float.parseFloat(sc.nextLine());
                        break;
                    } catch (NumberFormatException e) {
                        System.out.println("Sai Format!");
                    }
                } while (true);
                float b;
                do {
                    System.out.print("Vui lòng nhập độ dài cạnh b: ");
                    try {
                        b = Float.parseFloat(sc.nextLine());
                        break;
                    } catch (NumberFormatException e) {
                        System.out.println("Sai Format!");

                    }
                }
                while (true);
                float c;
                do {
                    System.out.print("Vui lòng nhập độ dài cạnh c:");
                    try {
                        c = Float.parseFloat(sc.nextLine());
                        break;
                    } catch (NumberFormatException e) {
                        System.out.println("Sai Format!");
                    }
                }
                while (true);

                checkTriangle(a, b, c);
                System.out.println(" Yes! ");
                break;
            } catch (IllegalTriangleException numberFormatException) {
                System.out.println(numberFormatException.getMessage());
            }
        }
        while (true);
    }

    public static void checkTriangle(float a, float b, float c) throws IllegalTriangleException {
        if (a + b < c || b + c < a || a + c < b || a < 0 || b < 0 || c < 0) {
            throw new IllegalTriangleException("Error");
        }
    }
}
