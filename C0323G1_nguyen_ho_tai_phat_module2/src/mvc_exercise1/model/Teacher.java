package mvc_exercise1.model;


public class Teacher extends Person {
    private String expertise;

    public Teacher(String id, String name, String dateOfBirt, boolean gender, String expertise) {
        super(id, name, dateOfBirt, gender);
        this.expertise = expertise;
    }

    @Override
    public String toString() {
        return "Thông tin giảng viên: " +
                "ID: " + super.getId() +
                ", Họ và tên: " + super.getName() +
                ", Ngày sinh: " + super.getDateOfBirth() +
                ", Giới tính: " + (super.isGender() ? "Name" : "Nữ")+
                ", Chuyên môn: " + expertise;
    }
}
