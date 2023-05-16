package ss7_abstract_class_and_interface.practice.practice_1;

public class Chicken extends Animal implements Edible {
    @Override
    public String howToEat() {
        return "Chicken eating ...";
    }

    @Override
    public String makeSound() {
        return "Chicken: chit chit chit ...";
    }
}
