package furama_resort_management.repository.person.impl;

import furama_resort_management.model.person.impl.Employee;
import furama_resort_management.repository.person.IEmployeeRepository;
import furama_resort_management.utils.manipulate_file.ManipulateFile;

import java.util.ArrayList;
import java.util.List;

public class EmployeeRepository implements IEmployeeRepository {
    private static List<Employee> employeeList = new ArrayList<>();
    private static final String EMPLOYEE_PATH = "src/furama_resort_management/data/Employee.csv";

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

    public void add(Employee employee) {
        List<String> employeeList = new ArrayList<>();
        employeeList.add(getInfo(employee));
        ManipulateFile.writeToFile(EMPLOYEE_PATH, employeeList,true);
    }
    public Employee findById(String id){
        employeeList = getAll();
        for (Employee e: employeeList) {
            if(e.getId().equals(id)){
                return e;
            }
        }
        return null;
    }

    public String getInfo(Employee employee) {
        return employee.getId() + "," + employee.getName() + "," + employee.getDateOfBirth() + "," + employee.isGender() + "," + employee.getIdentityId() + "," + employee.getPhoneNumber() + "," + employee.getEmail() + "," + employee.getLevel() + "," + employee.getRole() + "," + employee.getSalary();
    }
}
