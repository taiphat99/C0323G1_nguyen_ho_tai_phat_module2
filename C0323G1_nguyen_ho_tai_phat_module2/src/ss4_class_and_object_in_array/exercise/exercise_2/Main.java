package ss4_class_and_object_in_array.exercise.exercise_2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        StopWatch watch = new StopWatch();
        Scanner sc = new Scanner(System.in);
        System.out.println("Start Time at: " + watch.start());
        System.out.println("Enter Yes to continue! =))");
        String breakPoint = sc.nextLine();
        System.out.println("End Time at: " + watch.end());
        System.out.println("Elapsed Time: " + watch.getElapsedTime());
    }
}
