package furama_resort_management.controller;


import java.util.Scanner;

public class FuramaController {
    private static final Scanner sc = new Scanner(System.in);
    private static final BookingController bookingController = new BookingController();
    private static final CustomerController customerController = new CustomerController();
    private static final EmployeeController employeeController = new EmployeeController();
    private static final FacilityController facilityController = new FacilityController();
    private static final PromotionController promotionController = new PromotionController();

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
            try {
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
            } catch (NumberFormatException n) {
                System.err.println("Format Error!");
            }
        }
        while (true);
    }
}