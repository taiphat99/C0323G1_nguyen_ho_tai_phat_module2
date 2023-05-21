package mvc_exercise1.model;

import java.util.Date;

public class Person {
    private String id;
    private String name;
    private String dateOfBirth;
    private boolean gender;
    public Person() {
    }
    public Person(String id, String name, String dateOfBirt, boolean gender) {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

}
