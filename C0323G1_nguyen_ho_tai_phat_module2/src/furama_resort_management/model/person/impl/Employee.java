package furama_resort_management.model.person.impl;

import furama_resort_management.model.person.Person;

public class Employee extends Person {
    private String level;
    private String role;
    private int salary;

    public Employee(String id, String name, String dateOfBirth, boolean gender, String identityId, String phoneNumber, String email, String level, String role, int salary) {
        super(id, name, dateOfBirth, gender, identityId, phoneNumber, email);
        this.level = level;
        this.role = role;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee Information: " + super.toString() + ", Level: " +
                level + ", Role: " + role + ", Salary: " + salary;

    }
}
