package ss4_class_and_object_in_array.exercise.exercise_3;

public class Fan {
    final int SLOW = 1;
    final int MEDIUM = 2;
    final int FAST = 3;
    private int speed = SLOW;
    private boolean on = false;
    private String color = "blue";
    private double radius = 5;


    public Fan(String color, double radius) {
        this.color = color;
        this.radius = radius;
    }

    public int getSLOW() {
        return this.SLOW;
    }

    public int getMEDIUM() {
        return this.MEDIUM;
    }

    public int getFAST() {
        return this.FAST;
    }

    public int getSpeed() {
        return this.speed;
    }

    public boolean getOn() {
        return this.on;
    }

    public String getColor() {
        return this.color;
    }

    public double getRadius() {
        return this.radius;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Fan{" +
                "speed=" + speed +
                ", on=" + on +
                ", color='" + color + '\'' +
                ", radius=" + radius +
                '}';
    }
}
