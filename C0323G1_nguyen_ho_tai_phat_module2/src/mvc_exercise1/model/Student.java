package mvc_exercise1.model;


public class Student extends Person {
    private String classes;
    private float grade;
    public Student(String id, String name, String dateOfBirth, boolean gender, String classes, float grade){
        super(id,name,dateOfBirth,gender);
        this.classes = classes;
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Thông tin học viên: " +
                "ID: "+ super.getId() +
                ", Họ và tên: " + super.getName() +
                ", Ngày sinh: " + super.getDateOfBirth() +
                ", Giới tính: " + (super.isGender()? "Nam": "Nữ") +
                ", Lớp: " + classes +
                ", Điểm: " + grade ;
    }
}
