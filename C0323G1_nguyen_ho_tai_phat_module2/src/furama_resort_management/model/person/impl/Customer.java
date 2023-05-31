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
}
