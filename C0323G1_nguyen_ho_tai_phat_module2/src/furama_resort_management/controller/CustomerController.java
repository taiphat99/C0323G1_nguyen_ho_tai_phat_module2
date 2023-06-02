package furama_resort_management.controller;

import furama_resort_management.service.person.impl.CustomerService;

import java.util.Scanner;

public class CustomerController {
    private static Scanner sc = new Scanner(System.in);
    private static CustomerService customerService = new CustomerService();

    public void menu() {
        mainLoop : do {
            System.out.println("-----------------------------------------------\n");
            System.out.println("-------------Customer Management---------------\n" +
                    "1. Display Customer List\n" +
                    "2. Add New Customer\n" +
                    "3. Edit Customer\n" +
                    "4. Delete Customer\n" +
                    "5. Find Customer\n" +
                    "6. Return Lobby\n" +
                    "Enter function please!");
            try {
                int choice = Integer.parseInt(sc.nextLine());
                switch (choice) {
                    case 1:
                        customerService.displayAll();
                        break mainLoop;
                    case 2:
                        customerService.add();
                        break mainLoop;
                    case 3:
                        customerService.edit();
                        break mainLoop;
                    case 4:
                        customerService.remove();
                        break mainLoop;
                    case 5:
                        customerService.find();
                        break mainLoop;
                    case 6:
                        break mainLoop;
                    default:
                        System.err.println("Error!");
                }
            } catch (NumberFormatException n) {
                System.err.println("Format Error!");
            }
        }while(true);
    }
}
