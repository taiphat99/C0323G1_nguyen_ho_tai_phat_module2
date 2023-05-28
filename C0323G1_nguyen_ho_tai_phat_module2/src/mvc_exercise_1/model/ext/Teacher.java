package mvc_exercise_1.model.ext;


import mvc_exercise_1.model.Person;

public class Teacher extends Person {
    private String major;

    public Teacher(String id, String name, String dateOfBirth, boolean gender, String major) {
        super(id, name, dateOfBirth, gender);
        this.major = major;
    }

    @Override
    public String toString() {
        return super.toString() + ", Chuyên môn: " + major;
    }

    @Override
    public String getInfoPerson() {
        return super.getInfoPerson() + major;
    }
}
