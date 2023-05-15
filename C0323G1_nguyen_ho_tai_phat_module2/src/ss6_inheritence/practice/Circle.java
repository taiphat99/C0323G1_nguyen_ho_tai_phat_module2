package ss6_inheritence.practice;

public class Circle extends Shape {
    private double radius;
    private final double PI = 3.14;

    public Circle() {
        this.radius = 1;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return this.radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public double getArea() {
        return PI * this.radius * this.radius;
    }

    public double getPerimeter() {
        return PI * 2 * this.radius;
    }

    @Override
    public String toString() {
        return "A Circle with radius = " + this.radius + ", which is a subclass of " + super.toString();
    }

}
