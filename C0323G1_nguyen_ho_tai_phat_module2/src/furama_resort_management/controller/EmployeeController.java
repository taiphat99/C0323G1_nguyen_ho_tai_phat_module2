package furama_resort_management.controller;

import java.util.Scanner;

public class EmployeeController {
    Scanner sc = new Scanner(System.in);

    public void menu() {
        System.out.println("-----------------------------------------------\n");
        System.out.println("--------------Employee Management--------------\n" +
                "1. Display Employee List\n" +
                "2. Add New Employee\n" +
                "3. Edit Employee\n" +
                "4. Return Lobby");
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
        }
    }
}
