package ss1_introduction_to_java.exercise;

import java.util.Scanner;

public class SayHello {
    public static void main(String[] args) {
        System.out.println(" Enter your name: ");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.println("Hello " + name + " =))) ");
    }
}
