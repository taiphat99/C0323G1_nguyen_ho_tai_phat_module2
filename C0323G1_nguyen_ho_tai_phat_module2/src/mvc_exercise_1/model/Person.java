package mvc_exercise_1.model;

import java.util.Objects;

public abstract class Person {
    private String id;
    private String name;
    private String dateOfBirth;
    private boolean gender;

    public Person(String id, String name, String dateOfBirth, boolean gender) {
        this.id = id;
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.gender = gender;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return id.equals(person.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Thông tin chi tiết -- " +
                "ID: " + id +
                ", Họ và Tên: " + name +
                ", Ngày sinh: " + dateOfBirth +
                ", Giới tính: " + (gender? "Nam":"Nữ");
    }
    public String getInfoPerson(){
        return id + "," + name + "," + dateOfBirth + "," + gender + ",";
    }
}
