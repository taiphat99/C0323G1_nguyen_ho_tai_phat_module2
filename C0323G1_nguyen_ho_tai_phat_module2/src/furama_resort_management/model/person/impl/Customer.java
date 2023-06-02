package furama_resort_management.model.person.impl;

import furama_resort_management.model.person.Person;

public class Customer extends Person {
    private String rank;
    private String address;
    public Customer(String id, String name, String dateOfBirth, boolean gender, String identityId, String phoneNumber, String email,String rank,String address) {
        super(id, name, dateOfBirth, gender, identityId, phoneNumber, email);
        this.rank = rank;
        this.address = address;
    }

    @Override
    public String toString() {
        return "Customer Information: " + super.toString()+
                ", Rank: " + rank +
                ", Address:" + address;
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

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
