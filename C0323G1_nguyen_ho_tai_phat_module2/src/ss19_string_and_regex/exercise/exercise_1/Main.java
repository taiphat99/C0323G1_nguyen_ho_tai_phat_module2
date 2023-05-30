package ss19_string_and_regex.exercise.exercise_1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String className;
        String regex = "^C[0-9]{4}[G|H|I|K]$";
        do{
            System.out.println("Vui lòng nhập tên lớp: ");
            className = sc.nextLine();
        } while(!Validate.checkClassName(className,regex));
        System.out.println("OK");
    }
}
