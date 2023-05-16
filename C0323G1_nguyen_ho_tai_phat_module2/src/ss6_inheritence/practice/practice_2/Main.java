package ss6_inheritence.practice.practice_2;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat();
        Animal animal1 = cat; // Chuyển kiểu không tường minh
        Animal animal2 = cat; // Chuyển kiểu tường minh
        cat.eat();
        cat.meow();
//        animal1.meow; // không được!
        animal1.eat();
        animal2.eat();
//        animal2.meow(); // Không thể gọi phương thức meow()
        cat.meow();
    }
}
