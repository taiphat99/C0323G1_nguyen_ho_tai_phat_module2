package ss7_abstract_class_and_interface.practice.practice_1;


public class Tiger extends Animal implements Edible {

    @Override
    public String howToEat() {
        return null;
    }

    @Override
    public String makeSound() {
        return "Tiger: rarrrrrrr ...";
    }
}
