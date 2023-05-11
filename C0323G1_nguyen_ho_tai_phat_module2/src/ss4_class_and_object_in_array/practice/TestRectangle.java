package ss4_class_and_object_in_array.practice;

import java.util.Scanner;

public class TestRectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter width: ");
        int width = sc.nextInt();
        System.out.println("Enter height: ");
        int height = sc.nextInt();
        Rectangle rectangle = new Rectangle(width,height);
        System.out.println("Your Rectangle\n" + rectangle.display());
        System.out.println("Area of the rectangle: " + rectangle.getArea());
        System.out.println("Perimeter of the rectangle: " + rectangle.getPerimeter());
    }
}
