package ss6_inheritence.exercise.exercise_3;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Point point = new Point(5.5f,6.6f);
        System.out.println(point);
        System.out.println(Arrays.toString(point.getXY()));

        MovablePoint movablePoint= new MovablePoint(2f,3f,8f,9f);

        System.out.println(movablePoint);
        System.out.println(movablePoint.move());

    }
}
