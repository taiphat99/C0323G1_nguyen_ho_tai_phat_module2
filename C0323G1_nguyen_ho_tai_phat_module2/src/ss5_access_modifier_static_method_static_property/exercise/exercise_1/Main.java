package ss5_access_modifier_static_method_static_property.exercise.exercise_1;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.printCircle();
        System.out.println("Area : " + circle.getArea());
        circle.setRadius(5);
        circle.printCircle();
        System.out.println("Area : " + circle.getArea());
    }
}
