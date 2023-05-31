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

    @Override
    public boolean equals(Object o) {
        return super.equals(o);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public String getId() {
        return super.getId();
    }

    @Override
    public void setId(String id) {
        super.setId(id);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    @Override
    public String getDateOfBirth() {
        return super.getDateOfBirth();
    }

    @Override
    public void setDateOfBirth(String dateOfBirth) {
        super.setDateOfBirth(dateOfBirth);
    }

    @Override
    public boolean isGender() {
        return super.isGender();
    }

    @Override
    public void setGender(boolean gender) {
        super.setGender(gender);
    }

    @Override
    public String getIdentityId() {
        return super.getIdentityId();
    }

    @Override
    public void setIdentityId(String identityId) {
        super.setIdentityId(identityId);
    }

    @Override
    public String getPhoneNumber() {
        return super.getPhoneNumber();
    }

    @Override
    public void setPhoneNumber(String phoneNumber) {
        super.setPhoneNumber(phoneNumber);
    }

    @Override
    public String getEmail() {
        return super.getEmail();
    }

    @Override
    public void setEmail(String email) {
        super.setEmail(email);
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
