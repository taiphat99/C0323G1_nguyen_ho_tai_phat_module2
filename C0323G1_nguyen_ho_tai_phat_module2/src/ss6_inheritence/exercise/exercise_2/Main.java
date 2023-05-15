package ss6_inheritence.exercise.exercise_2;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Point2D point2D = new Point2D(5.5f,6.6f);
        System.out.println(Arrays.toString(point2D.getXY()));
        Point3D point3D = new Point3D(5.5f,2.2f,4.4f);
        System.out.println(Arrays.toString(point3D.getXYZ()));
    }
}
