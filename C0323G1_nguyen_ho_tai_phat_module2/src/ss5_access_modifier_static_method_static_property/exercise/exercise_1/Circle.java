package ss5_access_modifier_static_method_static_property.exercise.exercise_1;

public class Circle {
    private static final double PI = 3.14;
    private double radius = 2;
    private String color = "red";

    public Circle() {
    }

    Circle(double radius) {
        this.radius = radius;
    }
    public void printCircle(){
        System.out.println("The radius of the circle is : r = " + radius);

    }
    public void setRadius(double radius) {
        this.radius = radius;
    }

    double getRadius() {
        return radius;
    }

    double getArea() {
        return PI * radius * radius;
    }
}
