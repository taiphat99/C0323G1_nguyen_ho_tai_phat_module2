package furama_resort_management.service.booking.impl;

import furama_resort_management.model.booking.Booking;
import furama_resort_management.model.facility.Facility;
import furama_resort_management.repository.booking.IBookingRepository;
import furama_resort_management.repository.booking.impl.BookingRepository;
import furama_resort_management.repository.facility.IFacilityRepository;
import furama_resort_management.repository.facility.impl.FacilityRepository;
import furama_resort_management.repository.person.ICustomerRepository;
import furama_resort_management.repository.person.impl.CustomerRepository;
import furama_resort_management.service.booking.IBookingService;
import furama_resort_management.service.facility.IFacilityService;
import furama_resort_management.service.facility.impl.FacilityService;
import furama_resort_management.service.person.ICustomerService;
import furama_resort_management.service.person.impl.CustomerService;
import furama_resort_management.utils.regex.Regex;

import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class BookingService implements IBookingService {
    private static final ICustomerRepository customerRepository = new CustomerRepository();
    private static final Scanner sc = new Scanner(System.in);
    private static final ICustomerService customerService = new CustomerService();
    private static final IBookingRepository bookingRepository = new BookingRepository();
    private static final IFacilityService facilityService = new FacilityService();
    private static final IFacilityRepository facilityRepository = new FacilityRepository();

    public void addBooking() {
        String bookingId;
        do {
            System.out.println("Enter booking ID: ");
            bookingId = sc.nextLine();
            if (Regex.validate(bookingId, Regex.BOOKING_ID_REGEX)) {
                if (bookingRepository.findById(bookingId) != null) {
                    System.out.println("This ID already exist!");
                } else {
                    break;
                }
            } else {
                System.err.println("Invalid Booking ID!");
            }
        } while (true);

        String customerId;
        do {
            customerService.displayAll();
            System.out.println("Enter Customer ID: ");
            customerId = sc.nextLine();
            if (Regex.validate(customerId, Regex.CUSTOMER_ID_REGEX)) {
                if (customerRepository.findById(customerId) == null) {
                    System.out.println("This customer ID wasn't created! Please create the customer before adding Booking");
                    return;
                } else {
                    break;
                }
            } else {
                System.err.println("Format Error!");
            }
        } while (true);

        String bookingDate;
        do {
            System.out.println("Enter booking date: ");
            bookingDate = sc.nextLine();
            if (Regex.validate(bookingDate, Regex.DATE_OF_BIRTH_REGEX)) {
                break;
            } else {
                System.err.println("Invalid Date!");
            }
        } while (true);

        String startedDate;
        do {
            System.out.println("Enter started Dated: ");
            startedDate = sc.nextLine();
            if (Regex.validate(startedDate, Regex.DATE_OF_BIRTH_REGEX)) {
                break;
            } else {
                System.err.println("Invalid Date!");
            }
        } while (true);

        String endedDate;
        do {
            System.out.println("Enter ended Date: ");
            endedDate = sc.nextLine();
            if (Regex.validate(endedDate, Regex.DATE_OF_BIRTH_REGEX)) {
                break;
            } else {
                System.err.println("Invalid Date!");
            }
        } while (true);

        String facilityId;
        do {
            facilityService.display();
            System.out.println("Enter Facility ID: ");
            facilityId = sc.nextLine();
            if (facilityRepository.findById(facilityId) == null) {
                System.err.println("This Facility ID doesn't exist. Enter again!");
            } else {
                break;
            }
        } while (true);
        bookingRepository.add(new Booking(bookingId, bookingDate, startedDate, endedDate, customerId, facilityId));
        facilityRepository.valueOfFacilityPlusOne(facilityId);
    }

    @Override
    public void displayBooking() {
        Set<Booking> bookingSet = bookingRepository.getAll();
        for (Booking booking: bookingSet) {
            System.out.println(booking);
        }

    }

    @Override
    public void createContract() {

    }

    @Override
    public void displayContract() {

    }

    @Override
    public void editContract() {

    }
}


