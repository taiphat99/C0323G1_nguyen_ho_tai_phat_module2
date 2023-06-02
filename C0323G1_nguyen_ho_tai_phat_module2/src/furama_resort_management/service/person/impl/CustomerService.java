package furama_resort_management.service.person.impl;

import furama_resort_management.model.person.impl.Customer;
import furama_resort_management.repository.person.impl.CustomerRepository;
import furama_resort_management.service.person.ICustomerService;
import furama_resort_management.utils.regex.Regex;

import java.util.List;
import java.util.Scanner;

public class CustomerService implements ICustomerService {
    private static final CustomerRepository customerRepository = new CustomerRepository();
    private static final Scanner sc = new Scanner(System.in);


    @Override
    public void displayAll() {
        List<Customer> customerList = customerRepository.getAll();
        for (Customer c : customerList) {
            System.out.println(c);
        }
    }

    @Override
    public void add() {
        //String id, String name, String dateOfBirth, boolean gender, String identityId,
        // String phoneNumber, String email,String rank,String address
        String id;
        do {
            System.out.println("Enter new customer's ID (KH-YYYY, Y is a number 0-9, Example: KH-1234,KH-8888):");
            id = sc.nextLine();
            if (Regex.validate(id, Regex.CUSTOMER_ID_REGEX)) {
                break;
            } else {
                System.err.println("Invalid ID!");
            }
        } while (true);

        if (customerRepository.findById(id) != null) {
            System.out.println("This ID existed already!");
        } else {
            String name;
            do {
                System.out.println("Enter new customer's name (First character must be capitalized!): ");
                name = sc.nextLine();
                if (Regex.validate(name, Regex.NAME_REGEX)) {
                    break;
                } else {
                    System.err.println("Format Error!");
                }
            }
            while (true);

            String dateOfBirth;
            do {
                System.out.println("Enter new customer's Date of Birth (Must be YYYY-MM-DD): ");
                dateOfBirth = sc.nextLine();
                if (Regex.validate(dateOfBirth, Regex.DATE_OF_BIRTH_REGEX)) {
                    if (Regex.checkEighteenYearsOld(dateOfBirth)) {
                        break;
                    } else {
                        System.err.println("Under 18 years old!");
                    }
                } else {
                    System.err.println("Invalid Date of Birth!");
                }
            } while (true);

            boolean gender;
            loop1:
            do {
                System.out.println("Enter new customer's gender: \n" +
                        "1. Male\n" +
                        "2. Female\n" +
                        "Enter here: ");
                try {
                    int genderOption = Integer.parseInt(sc.nextLine());
                    switch (genderOption) {
                        case 1:
                            gender = true;
                            break loop1;
                        case 2:
                            gender = false;
                            break loop1;
                        default:
                            throw new RuntimeException("WHAT THE HECK????????");
                    }
                } catch (NumberFormatException n) {
                    System.err.println("Format Error!");
                }
            } while (true);

            String identityId;
            do {
                System.out.println("Enter new customer's Identity ID (Must be 9 or 12 digits): ");
                identityId = sc.nextLine();
                if (Regex.validate(identityId, Regex.IDENTITY_ID_REGEX)) {
                    break;
                } else {
                    System.err.println("Invalid Identity ID!");
                }
            } while (true);

            String phoneNumber;
            do {
                System.out.println("Enter new customer's Phone Number: ");
                phoneNumber = sc.nextLine();
                if (Regex.validate(phoneNumber, Regex.PHONE_NUMBER_REGEX)) {
                    break;
                } else {
                    System.err.println("Invalid Phone Number!");
                }
            } while (true);

            String email;
            do {
                System.out.println("Enter new customer's Email: ");
                email = sc.nextLine();
                if (Regex.validate(email, Regex.EMAIL_REGEX)) {
                    break;
                } else {
                    System.err.println("Invalid Email!");
                }
            } while (true);

            String rank;
            loop2:
            do {
                System.out.println("Enter new customer's Rank: \n" +
                        "1. Diamond\n" +
                        "2. Platinum\n" +
                        "3. Gold\n" +
                        "4. Silver\n" +
                        "5. Member\n" +
                        "Enter here:");
                try {
                    int rankOption = Integer.parseInt(sc.nextLine());
                    switch (rankOption) {
                        case 1:
                            rank = "Diamond";
                            break loop2;
                        case 2:
                            rank = "Platinum";
                            break loop2;
                        case 3:
                            rank = "Gold";
                            break loop2;
                        case 4:
                            rank = "Silver";
                            break loop2;
                        case 5:
                            rank = "Member";
                            break loop2;
                        default:
                            System.err.println("Invalid rank!");
                    }
                } catch (NumberFormatException n) {
                    System.err.println("Format Error!");
                }
            } while (true);

            System.out.println("Enter new customer's Address: ");
            String address = sc.nextLine();
            customerRepository.add(new Customer(id, name, dateOfBirth, gender, identityId, phoneNumber, email, rank, address));
            System.out.println("Add successfully!");
        }
    }

    @Override
    public void edit() {

        System.out.println("-----------------------------------------------");
        System.out.println("Enter ID You would like to edit: ");
        String id = sc.nextLine();
        Customer customer = customerRepository.findById(id);
        if (customer == null) {
            System.out.println("This ID doesn't exist!");
        } else {
            mainLoop:
            do {
                System.out.println("-----------------------------------------------");
                System.out.println(customer);
                System.out.println("-----------------------------------------------");

                System.out.println("Enter property You would like to edit: \n" +
                        "1. Name\n" +
                        "2. Date Of Birth\n" +
                        "3. Gender\n" +
                        "4. Identity ID\n" +
                        "5. Phone Number\n" +
                        "6. Email\n" +
                        "7. Rank\n" +
                        "8. Address\n" +
                        "9. Update and Return\n" +
                        "Enter your choice!");
                try {
                    int editOption = Integer.parseInt(sc.nextLine());
                    switch (editOption) {
                        case 1:
                            do {
                                System.out.println("Enter new Name: ");
                                String name = sc.nextLine();
                                if (Regex.validate(name, Regex.NAME_REGEX)) {
                                    customer.setName(name);
                                    System.out.println("Edit successfully!");
                                    break;
                                } else {
                                    System.err.println("Invalid Name!");
                                }
                            } while (true);
                            break;
                        case 2:
                            String dateOfBirth;
                            do {
                                System.out.println("Enter new Date of Birth (YYYY-MM-DD):");
                                dateOfBirth = sc.nextLine();
                                if (Regex.validate(dateOfBirth, Regex.DATE_OF_BIRTH_REGEX)) {
                                    if (Regex.checkEighteenYearsOld(dateOfBirth)) {
                                        customer.setDateOfBirth(dateOfBirth);
                                        System.out.println("Edit successfully!");
                                        break;
                                    } else {
                                        System.err.println("Under 18 years old!");
                                    }
                                } else {
                                    System.err.println("Format Error!");
                                }
                            } while (true);
                            break;
                        case 3:
                            boolean gender;
                            do {
                                System.out.println("Enter new employee Gender: \n" +
                                        "1. Male\n" +
                                        "2. Female");
                                try {
                                    int choice = Integer.parseInt(sc.nextLine());
                                    if (choice == 1) {
                                        gender = true;
                                        break;
                                    } else if (choice == 2) {
                                        gender = false;
                                        break;
                                    } else {
                                        System.err.println("Invalid Gender!");
                                    }
                                } catch (NumberFormatException n) {
                                    System.err.println("Format Error!");
                                }
                            } while (true);
                            customer.setGender(gender);
                            System.out.println("Edit successfully!");
                            break;
                        case 4:
                            String identityId;
                            do {
                                System.out.println("Enter new Identity ID:");
                                identityId = sc.nextLine();
                                if (Regex.validate(identityId, Regex.IDENTITY_ID_REGEX)) {
                                    customer.setIdentityId(identityId);
                                    System.out.println("Edit successfully!");
                                    break;
                                } else {
                                    System.err.println("Invalid Identity ID");
                                }
                            } while (true);
                            break;
                        case 5:
                            String phoneNumber;
                            do {
                                System.out.println("Enter new Phone Number: ");
                                phoneNumber = sc.nextLine();
                                if (Regex.validate(phoneNumber, Regex.PHONE_NUMBER_REGEX)) {
                                    customer.setPhoneNumber(phoneNumber);
                                    System.out.println("Edit successfully!");
                                    break;
                                } else {
                                    System.err.println("Invalid Phone Number!");
                                }
                            } while (true);
                            break;
                        case 6:
                            String email;
                            do {
                                System.out.println("Enter new Email: ");
                                email = sc.nextLine();
                                if (Regex.validate(email, Regex.EMAIL_REGEX)) {
                                    customer.setEmail(email);
                                    System.out.println("Edit successfully!");
                                    break;
                                }
                            } while (true);
                            break;
                        case 7:
                            String rank;
                            loop6:
                            do {
                                System.out.println("Enter new Rank: \n" +
                                        "1. Diamond\n" +
                                        "2. Platinum\n" +
                                        "3. Gold\n" +
                                        "4. Silver\n" +
                                        "5. Member\n" +
                                        "Enter here!");
                                try {
                                    int rankOption = Integer.parseInt(sc.nextLine());
                                    switch (rankOption) {
                                        case 1:
                                            rank = "Diamond";
                                            break loop6;
                                        case 2:
                                            rank = "Platinum";
                                            break loop6;
                                        case 3:
                                            rank = "Gold";
                                            break loop6;
                                        case 4:
                                            rank = "Silver";
                                            break loop6;
                                        case 5:
                                            rank = "Member";
                                            break loop6;
                                        default:
                                            System.err.println("Invalid Number!");
                                    }
                                } catch (NumberFormatException n) {
                                    System.err.println("Format Error!");
                                }

                            } while (true);
                            customer.setRank(rank);
                            System.out.println("Edit successfully!");

                        case 8:
                            System.out.println("Enter new customer's Address: ");
                            String address = sc.nextLine();
                            customer.setAddress(address);
                            System.out.println("Edit successfully!");
                        case 9:
                            customerRepository.updateCustomer(customer);
                            break mainLoop;
                        default:
                            System.err.println("Invalid number!");
                            break;
                    }
                } catch (NumberFormatException n) {
                    System.err.println("Format Error!");
                }
            } while (true);
        }
    }

    @Override
    public void remove() {
        System.out.println("Enter ID you would like to delete: ");
        String id = sc.nextLine();
        Customer customer = customerRepository.findById(id);
        if (customer == null) {
            System.out.println("This ID doesn't exist!");
        } else {
            loop3:
            do {
                System.out.println("Are you sure deleting ID " + customer.getId() + ": \n" +
                        "1. Yes\n" +
                        "2. No");
                try {
                    int deleteOption = Integer.parseInt(sc.nextLine());
                    switch (deleteOption) {
                        case 1:
                            customerRepository.remove(customer);
                            System.out.println("Delete successfully!");
                            break loop3;
                        case 2:
                            System.out.println("Delete unsuccessfully!");
                            break loop3;
                        default:
                            System.err.println("Invalid Number!");
                    }
                } catch (NumberFormatException n) {
                    System.err.println("Format Error!");
                }
            } while (true);
        }
    }

    @Override
    public void find() {
        System.out.println("Enter the name you would like to find: ");
        String name = sc.nextLine();
        List<Customer> findingList = customerRepository.findByName(name);
        if (findingList.size() == 0) {
            System.out.println("Not Found!");
        } else {
            for (Customer c : findingList) {
                System.out.println(c);
            }
        }
    }
}
