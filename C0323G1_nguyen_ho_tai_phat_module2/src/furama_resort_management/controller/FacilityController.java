package furama_resort_management.controller;

import furama_resort_management.service.facility.impl.FacilityService;

import java.lang.invoke.SwitchPoint;
import java.util.Scanner;

public class FacilityController {
    private static final Scanner sc = new Scanner(System.in);
    private static final FacilityService facilityService = new FacilityService();

    public void menu(){
        System.out.println("-----------------------------------------------\n");
        System.out.println("---------------Facility Management-------------\n" +
                "1. Display Facility List\n" +
                "2. Add New Facility\n" +
                "3. Delete Facility\n" +
                "4. Display Facility List Maintenance\n" +
                "5. Return Lobby\n" +
                "Enter function please!");
        int choice = Integer.parseInt(sc.nextLine());
        switch (choice){
            case 1:
                facilityService.display();
                break;
            case 2:
                facilityService.add();
                break;
            case 3:
                facilityService.remove();
                break;
            case 4:
                facilityService.displayMaintenance();
                break;
            case 5:
                break;
        }
    }
}
