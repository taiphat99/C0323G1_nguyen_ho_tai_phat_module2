package furama_resort_management.service.person.impl;

import furama_resort_management.model.person.impl.Employee;
import furama_resort_management.repository.person.impl.EmployeeRepository;
import furama_resort_management.service.person.IEmployeeService;
import furama_resort_management.utils.regex.Regex;

import java.util.List;
import java.util.Scanner;

public class EmployeeService implements IEmployeeService {
    private final Scanner sc = new Scanner(System.in);
    private final EmployeeRepository employeeRepository = new EmployeeRepository();

    public void displayAll() {
        List<Employee> employeeList = employeeRepository.getAll();
        for (Employee e : employeeList) {
            System.out.println(e);
        }
    }

    @Override
    public void add() {
        //String id, String name, String dateOfBirth, boolean gender, String identityId, String phoneNumber, String email, String level, String role, int salary

        String id;
        do {
            System.out.println("Enter new employee ID (NV-YYYY, Y is a number 0-9, Example: NV-1234,NV-8888): ");
            id = sc.nextLine();
            if (Regex.validate(id, Regex.EMPLOYEE_ID_REGEX)) {
                break;
            } else {
                System.err.println("Invalid ID!");
            }
        } while (true);

        if (employeeRepository.findById(id) != null) {
            System.out.println("This ID exists already!");
        } else {
            String name;
            do {
                System.out.println("Enter new employee Name (First character must be capitalized): ");
                name = sc.nextLine();
                if (!Regex.validate(name, Regex.NAME_REGEX)) {
                    System.err.println("Invalid Name!");
                } else {
                    break;
                }
            }
            while (true);

            String dateOfBirth;
            do {
                System.out.println("Enter new employee Date Of Birth (YYYY-MM-DD): ");
                dateOfBirth = sc.nextLine();
                dateOfBirth = dateOfBirth.trim();
                if (!Regex.validate(dateOfBirth, Regex.DATE_OF_BIRTH_REGEX)) {
                    System.err.println("Format Error!");
                } else {
                    if (!Regex.checkEighteenYearsOld(dateOfBirth)) {
                        System.err.println("Under 18 years old!");
                    } else {
                        break;
                    }
                }
            }
            while (true);

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

            String identityId;
            do {
                System.out.println("Enter new employee Identity ID (9 or 12 digits): ");
                identityId = sc.nextLine();
                identityId = identityId.trim();
                if (!Regex.validate(identityId, Regex.IDENTITY_ID_REGEX)) {
                    System.err.println("Invalid Identity ID!");
                } else {
                    break;
                }
            }
            while (true);

            String phoneNumber;
            do {
                System.out.println("Enter new employee Phone Number: ");
                phoneNumber = sc.nextLine();
                phoneNumber = phoneNumber.trim();
                if (!Regex.validate(phoneNumber, Regex.PHONE_NUMBER_REGEX)) {
                    System.err.println("Invalid Phone Number!");
                } else {
                    break;
                }
            }
            while (true);

            String email;
            do {
                System.out.println("Enter new employee Email: ");
                email = sc.nextLine();
                email = email.trim();
                if (!Regex.validate(email, Regex.EMAIL_REGEX)) {
                    System.err.println("Invalid Email!");
                } else {
                    break;
                }

            }
            while (true);


            String level;
            loop1:
            do {
                System.out.println("Enter new employee Level: \n" +
                        "1. Intermediate\n" +
                        "2. College\n" +
                        "3. University\n" +
                        "4. Postgraduate");
                try {
                    int levelOption = Integer.parseInt(sc.nextLine());
                    switch (levelOption) {
                        case 1:
                            level = "Intermediate";
                            break loop1;
                        case 2:
                            level = "College";
                            break loop1;
                        case 3:
                            level = "University";
                            break loop1;
                        case 4:
                            level = "Postgraduate";
                            break loop1;
                        default:
                            System.err.println("Error!");
                    }
                } catch (NumberFormatException n) {
                    System.err.println("Format Error!");
                }
            } while (true);

            String role;
            loop2:
            do {
                System.out.println("Enter new employee Role: \n" +
                        "1. Receptionist\n" +
                        "2. Waiter/Waitress\n" +
                        "3. Specialist\n" +
                        "4. Supervisor\n" +
                        "5. Manager\n" +
                        "6. Director");
                try {
                    int roleOption = Integer.parseInt(sc.nextLine());
                    switch (roleOption) {
                        case 1:
                            role = "Receptionist";
                            break loop2;
                        case 2:
                            role = "Waiter/Waitress";
                            break loop2;
                        case 3:
                            role = "Specialist";
                            break loop2;
                        case 4:
                            role = "Supervisor";
                            break loop2;
                        case 5:
                            role = "Manager";
                            break loop2;
                        case 6:
                            role = "Director";
                            break loop2;
                        default:
                            System.err.println("Error!");
                    }
                } catch (NumberFormatException n) {
                    System.err.println("Format Error!");
                }
            } while (true);

            int salary;
            do {
                System.out.println("Enter new employee Salary: ");
                try {
                    salary = Integer.parseInt(sc.nextLine());
                    break;
                } catch (NumberFormatException n) {
                    System.err.println("Format Error!");
                }
            }
            while (true);
            Employee employee = new Employee(id, name, dateOfBirth, gender, identityId, phoneNumber, email, level, role, salary);
            employeeRepository.add(employee);
            System.out.println("Add successfully!");
        }
    }

    @Override
    public void edit() {
        System.out.println("-----------------------------------------------");
        System.out.println("Enter ID You would like to edit: ");
        String id = sc.nextLine();
        Employee employee = employeeRepository.findById(id);
        if (employee == null) {
            System.out.println("This ID doesn't exist!");
        } else {
            mainLoop:
            do {
                System.out.println("-----------------------------------------------");
                System.out.println(employee);
                System.out.println("-----------------------------------------------");

                System.out.println("Enter property You would like to edit: \n" +
                        "1. Name\n" +
                        "2. Date Of Birth\n" +
                        "3. Gender\n" +
                        "4. Identity ID\n" +
                        "5. Phone Number\n" +
                        "6. Email\n" +
                        "7. Level\n" +
                        "8. Role\n" +
                        "9. Salary\n" +
                        "10. Return\n" +
                        "Enter your choice!");
                try {
                    int editOption = Integer.parseInt(sc.nextLine());
                    switch (editOption) {
                        case 1:
                            do {
                                System.out.println("Enter new Name: ");
                                String name = sc.nextLine();
                                if (Regex.validate(name, Regex.NAME_REGEX)) {
                                    employee.setName(name);
                                    employeeRepository.updateEmployee(employee);
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
                                        employee.setDateOfBirth(dateOfBirth);
                                        employeeRepository.updateEmployee(employee);
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
                            employee.setGender(gender);
                            employeeRepository.updateEmployee(employee);
                            System.out.println("Edit successfully!");
                            break;
                        case 4:
                            String identityId;
                            do {
                                System.out.println("Enter new Identity ID:");
                                identityId = sc.nextLine();
                                if (Regex.validate(identityId, Regex.IDENTITY_ID_REGEX)) {
                                    employee.setIdentityId(identityId);
                                    employeeRepository.updateEmployee(employee);
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
                                    employee.setPhoneNumber(phoneNumber);
                                    employeeRepository.updateEmployee(employee);
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
                                    employee.setEmail(email);
                                    employeeRepository.updateEmployee(employee);
                                    System.out.println("Edit successfully!");
                                    break;
                                }
                            } while (true);
                            break;
                        case 7:
                            String level;
                            loop3:
                            do {
                                System.out.println("Enter new employee Level: \n" +
                                        "1. Intermediate\n" +
                                        "2. College\n" +
                                        "3. University\n" +
                                        "4. Postgraduate\n" +
                                        "Enter your choice!");
                                try {
                                    int levelOption = Integer.parseInt(sc.nextLine());
                                    switch (levelOption) {
                                        case 1:
                                            level = "Intermediate";
                                            break loop3;
                                        case 2:
                                            level = "College";
                                            break loop3;
                                        case 3:
                                            level = "University";
                                            break loop3;
                                        case 4:
                                            level = "Postgraduate";
                                            break loop3;
                                        default:
                                            System.err.println("Error!");
                                    }
                                } catch (NumberFormatException n) {
                                    System.err.println("Format Error!");
                                }
                            } while (true);
                            employee.setLevel(level);
                            employeeRepository.updateEmployee(employee);
                            System.out.println("Edit successfully!");
                            break;
                        case 8:
                            String role;
                            loop4:
                            do {
                                System.out.println("Enter new employee Role: \n" +
                                        "1. Receptionist\n" +
                                        "2. Waiter/Waitress\n" +
                                        "3. Specialist\n" +
                                        "4. Supervisor\n" +
                                        "5. Manager\n" +
                                        "6. Director\n" +
                                        "Enter your choice!");
                                try {
                                    int roleOption = Integer.parseInt(sc.nextLine());
                                    switch (roleOption) {
                                        case 1:
                                            role = "Receptionist";
                                            break loop4;
                                        case 2:
                                            role = "Waiter/Waitress";
                                            break loop4;
                                        case 3:
                                            role = "Specialist";
                                            break loop4;
                                        case 4:
                                            role = "Supervisor";
                                            break loop4;
                                        case 5:
                                            role = "Manager";
                                            break loop4;
                                        case 6:
                                            role = "Director";
                                            break loop4;
                                        default:
                                            System.err.println("Error!");
                                    }
                                } catch (NumberFormatException n) {
                                    System.err.println("Error!");
                                }
                            } while (true);
                            employee.setLevel(role);
                            employeeRepository.updateEmployee(employee);
                            System.out.println("Edit successfully!");
                            break;
                        case 9:
                            int salary;
                            do {
                                System.out.println("Enter new Salary: ");
                                try {
                                    salary = Integer.parseInt(sc.nextLine());
                                    break;
                                } catch (NumberFormatException n) {
                                    System.err.println("Format Error!");
                                }
                            }
                            while (true);
                            employee.setSalary(salary);
                            employeeRepository.updateEmployee(employee);
                            System.out.println("Edit successfully!");
                            break;
                        case 10:
                            break mainLoop;
                        default:
                            System.err.println("Error!");
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
        Employee employee = employeeRepository.findById(id);
        if (employee == null) {
            System.err.println("ID doesn't exist!");
        } else {
            loop5:
            do {
                System.out.println("Are you sure?\n" +
                        "1. Yes\n" +
                        "2. No");
                try {
                    int choice = Integer.parseInt(sc.nextLine());
                    switch (choice) {
                        case 1:
                            employeeRepository.remove(employee);
                            System.out.println("Delete successfully!");
                            break loop5;
                        case 2:
                            System.out.println("Delete unsuccessfully!");
                            break loop5;
                        default:
                            break;
                    }
                } catch (NumberFormatException n) {
                    System.err.println("Format Error!");
                }
            } while (true);
        }

    }

    @Override
    public void find() {
        System.out.println("Enter the Name you would like to find: ");
        String name = sc.nextLine();
        List<Employee> findingList = employeeRepository.findByName(name);
        if (findingList.size() == 0) {
            System.err.println("not Found!");
        } else {
            for (Employee e : findingList) {
                System.out.println(e);
            }
        }
    }
}
