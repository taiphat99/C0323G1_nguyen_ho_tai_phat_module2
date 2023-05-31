package furama_resort_management.controller;

import java.util.Scanner;

public class BookingController {
    Scanner sc = new Scanner(System.in);

    public void menu() {
        System.out.println("-----------------------------------------------\n");
        System.out.println("---------------Booking Management--------------\n" +
                "1. Add New Booking\n" +
                "2. Display Booking List\n" +
                "3. Create New Contract\n" +
                "4. Display Contract List\n" +
                "5. Edit Contract\n" +
                "6. Return Lobby\n" +
                "Enter function please!");
        int choice = Integer.parseInt(sc.nextLine());
        switch (choice) {
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
        }

    }
}
