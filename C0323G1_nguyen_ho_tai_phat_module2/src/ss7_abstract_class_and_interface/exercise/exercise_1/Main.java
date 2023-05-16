package ss7_abstract_class_and_interface.exercise.exercise_1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//        Rectangle rectangle = new Rectangle(1, 2);
//        System.out.println(rectangle.getArea());
//        rectangle.resize(100);
//        System.out.println(rectangle.getArea());
//
//
//        Square square = new Square(2);
//        System.out.println(square.getArea());
//        square.resize(100);
//        System.out.println(square.getArea());
//
//
//        Circle circle = new Circle(5);
//        System.out.println(circle.getRadius());
//        circle.resize(100);
//        System.out.println(circle.getRadius());


        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle(2);
        shapes[1] = new Rectangle(1,2 );
        shapes[2] = new Square(2);

        System.out.println("Input percent");
        Scanner scanner = new Scanner(System.in);
        double percent = Double.parseDouble(scanner.nextLine());

        for (Shape a : shapes) {
            if (a instanceof Circle) {
                System.out.println("Area of Circle before: ");
                System.out.println((((Circle) a).getArea()));
                ((Circle) a).resize(percent);
                System.out.println("Area of Circle after: ");
                System.out.println((((Circle) a).getArea()));

            } else if (a instanceof Square) {
                System.out.println("Area of Square before: ");
                System.out.println(((Square) a).getArea());
                ((Square) a).resize(percent);
                System.out.println("Area of Square after: ");
                System.out.println(((Square) a).getArea());

            } else if (a instanceof Rectangle) {
                System.out.println("Area of Rectangle before: ");
                System.out.println(((Rectangle) a).getArea());
                ((Rectangle) a).resize(percent);
                System.out.println("Area of Rectangle after: ");
                System.out.println(((Rectangle) a).getArea());

            }
        }
    }
}
