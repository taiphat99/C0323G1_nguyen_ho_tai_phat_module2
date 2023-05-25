package ss15_exception_and_debug.exercise.exercise_1;

import java.util.Scanner;

public class IllegalTriangleException extends Exception {
    public IllegalTriangleException(String message) {
        super(message);
    }

}
