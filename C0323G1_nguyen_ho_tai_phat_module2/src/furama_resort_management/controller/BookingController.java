package furama_resort_management.controller;

import furama_resort_management.service.booking.IBookingService;
import furama_resort_management.service.booking.impl.BookingService;

import java.util.Scanner;

public class BookingController {
    private static final Scanner sc = new Scanner(System.in);
    private static final IBookingService bookingService = new BookingService();

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
                bookingService.addBooking();
                break;
            case 2:
                bookingService.displayBooking();
                break;
            case 3:
                bookingService.createContract();
                break;
            case 4:
                bookingService.displayContract();
                break;
            case 5:
                bookingService.editContract();
                break;
            case 6:
                break;
        }

    }
}
