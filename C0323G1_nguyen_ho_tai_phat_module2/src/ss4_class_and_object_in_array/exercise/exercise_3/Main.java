package ss4_class_and_object_in_array.exercise.exercise_3;

public class Main {
    public static void main(String[] args) {
        Fan fan1 = new Fan("green", 10);
        Fan fan2 = new Fan("blue",5);
        fan1.setSpeed(fan1.FAST);
        fan1.setOn(true);
        fan1.setColor("yellow");
        System.out.println(fan1);
        System.out.println(fan2);
    }
}
