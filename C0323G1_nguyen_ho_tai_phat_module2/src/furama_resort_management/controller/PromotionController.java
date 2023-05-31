package furama_resort_management.controller;

import java.util.Scanner;

public class PromotionController {
    Scanner sc = new Scanner(System.in);

    public void menu() {
        System.out.println("-----------------------------------------------\n");
        System.out.println("-------------Promotion Management--------------\n" +
                "1. Display Customer List use Service\n" +
                "2. Display Customer List get Voucher\n" +
                "3. Return Lobby\n" +
                "Enter function please!");
        int choice = Integer.parseInt(sc.nextLine());
        switch (choice) {
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
        }

    }
}
