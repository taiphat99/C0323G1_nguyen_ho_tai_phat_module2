package ss1_introduction_to_java.bai_tap;

import java.util.Scanner;

public class bai_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int exchangeRate = 23000;
        System.out.println("Enter amount of money that you would like to exchange from USD to VND");
        int amount = sc.nextInt();
        System.out.println("Total money after exchanging is: " + amount * exchangeRate + " VND");

    }
}
