package mvc_exercise_1.model.ext;


import mvc_exercise_1.model.Person;

public class Student extends Person {
    private String className;
    private float grade;
    public Student(String id, String name, String dateOfBirth, boolean gender, String className, float grade){
        super(id,name,dateOfBirth,gender);
        this.className = className;
        this.grade = grade;
    }

    @Override
    public String toString() {
        return super.toString()+ ", Lớp: " + className + ", Điểm: " + grade ;
    }

    @Override
    public String getInfoPerson() {
        return super.getInfoPerson() + className + "," + grade;
    }
}
