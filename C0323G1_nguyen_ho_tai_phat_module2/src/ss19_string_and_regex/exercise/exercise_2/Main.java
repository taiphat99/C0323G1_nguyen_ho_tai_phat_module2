package ss19_string_and_regex.exercise.exercise_2;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String phoneNumber;
        String regex = "^(0|\\+84)\\d{9}$";
        do {
            System.out.println("Vui lòng nhập số điện thoại: ");
            phoneNumber = scanner.nextLine();
        }while(!Validate.checkPhoneNumber(phoneNumber, regex));
        System.out.println("OK");
    }
}
