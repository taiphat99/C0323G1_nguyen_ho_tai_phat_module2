package ss11_dsa_stack_queue.practice.practice_1;


public class Main {
    public static void main(String[] args) {
        MyGenericStack<String>  stack = new MyGenericStack();
        System.out.println("1. Stack of integers");
        stack.stackOfIntegers();
        System.out.println("\n2. Stack of Strings");
        stack.stackOfIStrings();
    }
}
