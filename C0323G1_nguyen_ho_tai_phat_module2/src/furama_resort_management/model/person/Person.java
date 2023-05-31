package furama_resort_management.model.person;

public abstract class Person {
    private String id;
    private String name;
    private String dateOfBirth;
    private boolean gender;
    private String identityId;
    private String phoneNumber;
    private String email;

    public Person(String id, String name, String dateOfBirth, boolean gender, String identityId, String phoneNumber, String email) {
        this.id = id;
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.gender = gender;
        this.identityId = identityId;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    @Override
    public String toString() {
        return "ID: " + id +
                ", Name: " + name +
                ", Date Of Birth: " + dateOfBirth +
                ", Gender: " + (gender?"Nam":"Nữ") +
                ", Identity ID: " + identityId +
                ", Phone Number: " + phoneNumber +
                ", Email: " + email;
    }
}
