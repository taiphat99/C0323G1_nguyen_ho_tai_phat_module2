package ss11_dsa_stack_queue.exercise.exercise_1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        int[] numberArray = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(numberArray));
        reverseNumberArray(numberArray);

        String string = "Nguyen Ho Tai Phat";
        System.out.println(string);
        reverseString(string);
    }

    public static void reverseNumberArray(int[] array) {
        Stack<Integer> numberStack = new Stack<>();
        for (int i : array) {
            numberStack.push(i);
        }
        for (int i = 0; i < array.length; i++) {
            array[i] = numberStack.pop();
        }
        System.out.println(Arrays.toString(array));
    }

    public static void reverseString(String str) {
        Stack<String> stringStack = new Stack<>();
        String[] stringArray = str.split(" ");
        for (String i : stringArray) {
            stringStack.push(i);
        }
        int stringStackSize = stringStack.size();
        StringBuilder finalString = new StringBuilder();
        for (int i = 0; i < stringStackSize; i++) {
            finalString.append(stringStack.pop()).append(" ");
        }
        System.out.println(finalString);
    }
}
