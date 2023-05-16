package ss7_abstract_class_and_interface.exercise.exercise_2;

public class Main {
    public static void main(String[] args) {

        Shape[] shapes = new Shape[3];
        Circle circle = new Circle(2);
        Rectangle rectangle = new Rectangle(2, 4);
        Square square = new Square(2);
        shapes[0] = circle;
        shapes[1] = rectangle;
        shapes[2] = square;

        for (Shape a : shapes) {
            if (a instanceof Colorable) {
                System.out.println(a.getArea() + ", ");
                ((Colorable) a).howToColor();
            } else {
                System.out.println(a.getArea());
            }

        }
    }
}
