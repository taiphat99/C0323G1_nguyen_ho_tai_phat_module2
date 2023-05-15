package ss6_inheritence.exercise.exercise_1;

public class Main {
    public static void main(String[] args) {

        Circle circle = new Circle(6, "Green");
        System.out.println(circle);
        System.out.println(circle.getArea());
        Cylinder cylinder = new Cylinder(6,"Red",9);
        System.out.println(cylinder);
        System.out.println(cylinder.getVolume());

        cylinder.setRadius(5);
        cylinder.setHeight(10);
        System.out.println(cylinder);


    }
}
