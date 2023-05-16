package ss7_abstract_class_and_interface.exercise.exercise_2;

public class Square extends Rectangle {
    public Square(double side) {
        super(side,side);
    }

    public Square(double side, String color, boolean filled) {
        super(side, side, "Pink", true);
    }

    public Square() {
        super(1, 1);
    }

    public double getSide() {
        return super.getWidth();
    }

    public void setSide(double side) {
        super.setWidth(side);
        super.setLength(side);
    }

    @Override
    public void setWidth(double side) {
        super.setWidth(side);
        super.setLength(side);
    }

    @Override
    public String toString() {
        return "A Square with side = " + getSide() + ", which is a subclass of " + super.toString();
    }

    @Override
    public void resize(double percent) {
        setSide(((100+percent)/100)*getSide());

    }
}
