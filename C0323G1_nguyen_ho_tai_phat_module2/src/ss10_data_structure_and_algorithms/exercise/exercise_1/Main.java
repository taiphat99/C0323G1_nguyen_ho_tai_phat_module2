package ss10_data_structure_and_algorithms.exercise.exercise_1;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        MyList<String> list = new MyList<>(5);
        list.add(0,"Danny");
        list.add(1,"is");
        list.add(2,"a");
        list.add(3,"pretty");
        list.add(4,"cool");
        list.add(5,"boy");
        list.add(6,"=))))");
//        list.remove(20);
        list.remove(6);
        System.out.println(list.indexOf("asd"));
        System.out.println(list.indexOf("A"));
        System.out.println(list.size());
        System.out.println(list.display());

    }
}


