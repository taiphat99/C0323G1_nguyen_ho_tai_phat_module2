package furama_resort_management.controller;


import java.util.Scanner;

public class FuramaController {
    private final Scanner sc = new Scanner(System.in);
    private final BookingController bookingController = new BookingController();
    private final CustomerController customerController = new CustomerController();
    private final EmployeeController employeeController = new EmployeeController();
    private final FacilityController facilityController = new FacilityController();
    private final PromotionController promotionController = new PromotionController();

    public void menu() {
        do {
            System.out.println("-----------------------------------------------\n");
            System.out.println("-------WELCOME TO FURAMA RESORT DA NANG--------\n" +
                    "1. Employee Management\n" +
                    "2. Customer Management\n" +
                    "3. Facility Management\n" +
                    "4. Booking Management\n" +
                    "5. Promotion Management\n" +
                    "6. Exit\n" +
                    "Enter function please!");
            int choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    employeeController.menu();
                    break;
                case 2:
                    customerController.menu();
                    break;
                case 3:
                    facilityController.menu();
                    break;
                case 4:
                    bookingController.menu();
                    break;
                case 5:
                    promotionController.menu();
                    break;
                case 6:
                    System.out.println("See You Again!");
                    System.exit(0);
            }
        }
        while (true) ;
    }
}