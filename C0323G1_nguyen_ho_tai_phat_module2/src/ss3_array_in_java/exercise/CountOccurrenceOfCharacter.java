package ss3_array_in_java.exercise;

import java.util.Scanner;

public class CountOccurrenceOfCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter character u would like to count: ");
        String character = sc.nextLine();

        String str = ("abcdeabcdaa");
        String [] strArray = str.split("");
        int count = 0;
        for (int i = 0; i < strArray.length; i++) {
            if (character.equals(strArray[i])){
                count++;
            }
        }
        System.out.println('"'+ character +'"' +  " appears " + count + " times");
    }
}
