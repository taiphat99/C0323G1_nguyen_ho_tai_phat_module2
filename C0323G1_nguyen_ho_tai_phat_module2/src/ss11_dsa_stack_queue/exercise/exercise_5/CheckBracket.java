package ss11_dsa_stack_queue.exercise.exercise_5;

import java.util.Stack;

public class CheckBracket {
    public static void main(String[] args) {
        String str = "s * (s – a) * (s – b) * (s – c)";
        String str1 = "(– b + (b2 – 4*a*c)^0.5) / 2*a";
        String str2 = "s * (s – a) * (s – b * (s – c)";
        String str3 = "(– b + (b^2 – 4*a*c)^(0.5/ 2*a)) ";
        System.out.println(checkBracket(str));
        System.out.println(checkBracket(str1));
        System.out.println(checkBracket(str2));
        System.out.println(checkBracket(str3));
    }

    public static boolean checkBracket(String str) {
        Stack<String> firstStack = new Stack<>();
        Stack<String> secondStack = new Stack<>();
        String[] array = str.split("");
        for (String i : array) {
            if (i.equals("(")) {
                firstStack.push(i);
            }
            if (i.equals(")")) {
                secondStack.push(i);
            }
        }
        return firstStack.size() == secondStack.size();
    }
}
