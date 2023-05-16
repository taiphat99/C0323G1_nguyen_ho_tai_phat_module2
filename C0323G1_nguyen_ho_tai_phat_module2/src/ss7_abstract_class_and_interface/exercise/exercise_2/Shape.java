package ss7_abstract_class_and_interface.exercise.exercise_2;

public abstract class Shape {
    private String color;
    private boolean filled;

    public Shape() {
        this.color = "Green";
        this.filled = true;
    }

    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }
    public abstract double getArea();

    @Override
    public String toString() {
        return "A Shape with color " + this.color + " and " + (isFilled() ? "Filled" : "Not Filled");
    }

}
