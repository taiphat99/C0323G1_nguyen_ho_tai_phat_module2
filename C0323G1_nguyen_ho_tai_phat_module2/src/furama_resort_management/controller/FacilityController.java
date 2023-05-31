package furama_resort_management.controller;

import java.lang.invoke.SwitchPoint;
import java.util.Scanner;

public class FacilityController {
    Scanner sc = new Scanner(System.in);

    public void menu(){
        System.out.println("-----------------------------------------------\n");
        System.out.println("---------------Facility Management-------------\n" +
                "1. Display Facility List\n" +
                "2. Add New Facility\n" +
                "3. Display Facility List Maintenance\n" +
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
