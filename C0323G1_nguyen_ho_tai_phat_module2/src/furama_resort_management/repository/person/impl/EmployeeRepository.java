package furama_resort_management.repository.person.impl;

import furama_resort_management.model.person.impl.Employee;
import furama_resort_management.repository.person.IEmployeeRepository;
import furama_resort_management.common.manipulate_file.ManipulateFile;

import java.util.ArrayList;
import java.util.List;

public class EmployeeRepository implements IEmployeeRepository {
    private static List<Employee> employeeList = new ArrayList<>();
    private static final String EMPLOYEE_PATH = "src/furama_resort_management/data/Employee.csv";

    @Override
    public List<Employee> getAll() {
        List<String> stringList = ManipulateFile.readFromFile(EMPLOYEE_PATH);
        employeeList.clear();
        String[] strings;
        for (String i : stringList) {
            strings = i.split(",");
            //String id, String name, String dateOfBirth, boolean gender, String identityId, String phoneNumber, String email, String level, String role, int salary
            employeeList.add(new Employee(strings[0], strings[1], strings[2], Boolean.parseBoolean(strings[3]), strings[4], strings[5], strings[6], strings[7], strings[8], Integer.parseInt(strings[9])));
        }
        return employeeList;
    }

    @Override
    public void add(Employee employee) {
        List<String> employeeList = new ArrayList<>();
        employeeList.add(getInfo(employee));
        ManipulateFile.writeToFile(EMPLOYEE_PATH, employeeList, true);
    }

    @Override
    public Employee findById(String id) {
        employeeList = getAll();
        for (Employee e : employeeList) {
            if (e.getId().equals(id)) {
                return e;
            }
        }
        return null;
    }

    @Override
    public List<Employee> findByName(String name) {
        employeeList = getAll();
        List<Employee> findingList = new ArrayList<>();
        for (Employee e : employeeList) {
            if (e.getName().toLowerCase().contains(name.toLowerCase())) {
                findingList.add(e);
            }
        }
        return findingList;
    }

    @Override
    public String getInfo(Employee employee) {
        return employee.getId() + "," + employee.getName() + "," + employee.getDateOfBirth() + "," + employee.isGender() + "," + employee.getIdentityId() + "," + employee.getPhoneNumber() + "," + employee.getEmail() + "," + employee.getLevel() + "," + employee.getRole() + "," + employee.getSalary();
    }

    @Override
    public void updateEmployee(Employee employee) {
        employeeList = getAll();
        List<String> employees = new ArrayList<>();
        for (Employee e : employeeList) {
            if (e.getId().equals(employee.getId())) {
                e.setName(employee.getName());
                e.setDateOfBirth(employee.getDateOfBirth());
                e.setGender(employee.isGender());
                e.setIdentityId(employee.getIdentityId());
                e.setPhoneNumber(employee.getPhoneNumber());
                e.setEmail(employee.getEmail());
                e.setLevel(employee.getLevel());
                e.setRole(employee.getRole());
                e.setSalary(employee.getSalary());
            }
        }
        for (Employee object : employeeList) {
            employees.add(getInfo(object));
        }
        ManipulateFile.writeToFile(EMPLOYEE_PATH, employees, false);
    }

    @Override
    public void remove(Employee employee) {
        List<String> employees = new ArrayList<>();
        employeeList = getAll();
        employeeList.remove(employee);
        for (Employee e : employeeList) {
            employees.add(getInfo(e));
        }
        ManipulateFile.writeToFile(EMPLOYEE_PATH, employees, false);
    }
}
