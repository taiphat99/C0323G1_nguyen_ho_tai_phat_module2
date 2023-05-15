package ss6_inheritence.practice;

public class Main {
    public static void main(String[] args) {
        //Test Shape Class
        Shape shape = new Shape();
        System.out.println(shape);
        Shape shape1 = new Shape("Red", true);
        System.out.println(shape1);

        //Test Circle
        Circle circle = new Circle(5.5,"Blue",true);
        System.out.println(circle);
        Circle circle1 = new Circle();
        System.out.println(circle1);
        Circle circle2 = new Circle(2.2);
        System.out.println(circle2);


        //Test Rectangle
        Rectangle rectangle = new Rectangle();
        System.out.println(rectangle);
        Rectangle rectangle1 = new Rectangle(9.9,10);
        System.out.println(rectangle1);
        Rectangle rectangle2 = new Rectangle(5,6,"Purple", false);
        System.out.println(rectangle2);

        //Test Square
        Square square = new Square();
        System.out.println(square);
        Square square1 = new Square(5,"Orange", true);
        System.out.println(square1);
    }


}
