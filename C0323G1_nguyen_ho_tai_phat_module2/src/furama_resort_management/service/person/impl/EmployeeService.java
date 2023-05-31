package furama_resort_management.service.person.impl;

import furama_resort_management.model.person.impl.Employee;
import furama_resort_management.repository.person.impl.EmployeeRepository;
import furama_resort_management.service.person.IEmployeeService;

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

    public void add() {
        //String id, String name, String dateOfBirth, boolean gender, String identityId, String phoneNumber, String email, String level, String role, int salary


        String id;
        do {
            System.out.println("Enter new employee ID: ");
            try {
                id = sc.nextLine();
                break;
            } catch (NumberFormatException n) {
                System.err.println("Format Error!");
            }
        }
        while (true);

        if (employeeRepository.findById(id) != null) {
            System.out.println("This ID exists already!");
        } else {
            String name;
            do {
                System.out.println("Enter new employee Name: ");
                try {
                    name = sc.nextLine();
                    break;
                } catch (NumberFormatException n) {
                    System.err.println("Format Error!");
                }
            }
            while (true);

            String dateOfBirth;
            do {
                System.out.println("Enter new employee Date Of Birth: ");
                try {
                    dateOfBirth = sc.nextLine();
                    break;
                } catch (NumberFormatException n) {
                    System.err.println("Format Error!");
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
                System.out.println("Enter new employee Identity ID: ");
                try {
                    identityId = sc.nextLine();
                    break;
                } catch (NumberFormatException n) {
                    System.err.println("Format Error!");
                }
            }
            while (true);

            String phoneNumber;
            do {
                System.out.println("Enter new employee Phone Number: ");
                try {
                    phoneNumber = sc.nextLine();
                    break;
                } catch (NumberFormatException n) {
                    System.err.println("Format Error!");
                }
            }
            while (true);

            String email;
            do {
                System.out.println("Enter new employee Email: ");

                try {
                    email = sc.nextLine();
                    break;
                } catch (NumberFormatException n) {
                    System.err.println("Format Error!");
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
                    System.err.println("Error!");
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
                        "10. Exit\n" +
                        "Enter your choice!");
                int editOption = Integer.parseInt(sc.nextLine());
                switch (editOption) {
                    case 1:
                        System.out.println("Enter new Name: ");
                        String name = sc.nextLine();
                        employee.setName(name);
                        employeeRepository.updateEmployee(employee);
                        System.out.println("Edit successfully!");
                        break;
                    case 2:
                        System.out.println("Enter new Date of Birth:");
                        String dateOfBirth = sc.nextLine();
                        employee.setDateOfBirth(dateOfBirth);
                        employeeRepository.updateEmployee(employee);
                        System.out.println("Edit successfully!");
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
                        System.out.println("Enter new Identity ID:");
                        String identityId = sc.nextLine();
                        employee.setIdentityId(identityId);
                        employeeRepository.updateEmployee(employee);
                        System.out.println("Edit successfully!");

                        break;
                    case 5:
                        System.out.println("Enter new Phone Number: ");
                        String phoneNumber = sc.nextLine();
                        employee.setPhoneNumber(phoneNumber);
                        employeeRepository.updateEmployee(employee);
                        System.out.println("Edit successfully!");
                        break;
                    case 6:
                        System.out.println("Enter new Email: ");
                        String email = sc.nextLine();
                        employee.setEmail(email);
                        employeeRepository.updateEmployee(employee);
                        System.out.println("Edit successfully!");
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
                        System.out.println("Enter new Salary: ");
                        int salary = Integer.parseInt(sc.nextLine());
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
            } while (true);
        }
    }
}
