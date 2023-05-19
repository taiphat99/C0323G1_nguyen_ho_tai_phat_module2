package ss11_dsa_stack_queue.exercise.exercise_2;

import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        System.out.println(converter(30));
        System.out.println(converter(41));
        System.out.println(converter(31));
        System.out.println(converter(5));
    }
    public static String converter(int number) {
        Stack<Integer> stack = new Stack<>();
        while (number / 2 != 0) {
            stack.push(number % 2);
            number = number / 2;
            if(number == 1){
                stack.push(1);
            }
        }
        StringBuilder str = new StringBuilder();
        int stackSize = stack.size();
        for (int i = 0; i <stackSize; i++) {
            str.append(stack.pop());
        }

        return str.toString();
    }
}
