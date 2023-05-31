package furama_resort_management.controller;

import java.util.Scanner;

public class CustomerController {
    Scanner sc = new Scanner(System.in);

    public void menu(){
        System.out.println("-----------------------------------------------\n");
        System.out.println("-------------Customer Management---------------\n" +
                "1. Display Customer List\n" +
                "2. Add New Customer\n" +
                "3. Edit Customer\n" +
                "4. Return Lobby");
        int choice = Integer.parseInt(sc.nextLine());
        switch (choice){
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
