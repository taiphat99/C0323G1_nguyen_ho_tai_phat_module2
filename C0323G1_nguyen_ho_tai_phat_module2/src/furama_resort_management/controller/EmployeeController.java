package furama_resort_management.controller;

import furama_resort_management.service.person.impl.EmployeeService;

import java.util.Scanner;

public class EmployeeController {
    Scanner sc = new Scanner(System.in);
    EmployeeService employeeService = new EmployeeService();

    public void menu() {
        System.out.println("-----------------------------------------------\n");
        System.out.println("--------------Employee Management--------------\n" +
                "1. Display Employee List\n" +
                "2. Add New Employee\n" +
                "3. Edit Employee\n" +
                "4. Return Lobby\n" +
                "Enter function please!");
        int choice = Integer.parseInt(sc.nextLine());
        switch (choice) {
            case 1:
                employeeService.displayAll();
                break;
            case 2:
                employeeService.add();
                break;
            case 3:
                employeeService.edit();
                break;
            case 4:
                break;
        }
    }
}
