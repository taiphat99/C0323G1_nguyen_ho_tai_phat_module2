package ss4_class_and_object_in_array.exercise.exercise_3;

public class Main {
    public static void main(String[] args) {
        Fan fan1 = new Fan("green", 10);
        System.out.println(fan1);
        Fan fan2 = new Fan("yellow",5);
        fan1.setColor("red");
        fan1.setOn(true);
        fan1.setSpeed(3);
        System.out.println(fan1);

    }
}
