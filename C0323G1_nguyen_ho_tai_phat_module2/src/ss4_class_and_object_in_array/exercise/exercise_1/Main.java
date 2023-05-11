package ss4_class_and_object_in_array.exercise.exercise_1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a: ");
        double a = sc.nextDouble();
        System.out.println("Enter b: ");
        double b = sc.nextDouble();
        System.out.println("Enter c: ");
        double c = sc.nextDouble();
        QuadraticEquation quadraticEquation = new QuadraticEquation(a, b, c);
        if (a == 0) {
            System.out.println("This is not a quadratic equation!");
        } else {
            if (quadraticEquation.getDelta() > 0) {
                System.out.println("There are 2 roots: \n" + "r1 = " + quadraticEquation.getRoot1() + ", r2 = " + quadraticEquation.getRoot2());
            } else if (quadraticEquation.getDelta() == 0) {
                System.out.println("There is a double root: r1 = r2 = " + quadraticEquation.getDoubleRoot());
            } else {
                System.out.println("There is no roots");
            }
        }
    }
}
