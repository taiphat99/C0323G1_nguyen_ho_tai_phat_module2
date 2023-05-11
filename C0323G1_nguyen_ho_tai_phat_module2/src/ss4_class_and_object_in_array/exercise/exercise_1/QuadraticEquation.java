package ss4_class_and_object_in_array.exercise.exercise_1;

public class QuadraticEquation {
    private double a;
    private double b;
    private double c;

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getDelta() {
        return b * b - 4 * a * c;
    }

    public double getRoot1() {
        return (-b + Math.sqrt(getDelta())) / (2 * a);
    }

    public double getRoot2() {
        return (-b - Math.sqrt(getDelta())) / (2 * a);
    }

    public double getDoubleRoot() {
        return -b / (2 * a);
    }


}

