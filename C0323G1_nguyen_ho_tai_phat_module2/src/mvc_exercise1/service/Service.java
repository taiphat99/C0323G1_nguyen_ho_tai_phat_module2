package mvc_exercise1.service;

import mvc_exercise1.model.Person;
import mvc_exercise1.model.Student;
import mvc_exercise1.model.Teacher;
import mvc_exercise1.repository.Repository;
import mvc_exercise1.service.impl.IService;

import java.util.List;
import java.util.Scanner;

public class Service implements IService {
    private Scanner sc = new Scanner(System.in);
    private Repository repository = new Repository();

    @Override
    public void add() {
        System.out.println("Bạn muốn thêm đối tượng nào?\n" +
                "1: Học Sinh \n" +
                "2: Giảng Viên");
        int choice = Integer.parseInt(sc.nextLine());
        switch (choice) {
            case 1:
                addStudent();
                break;
            case 2:
                addTeacher();
                break;
        }

    }

    public void addStudent() {
        System.out.print("Vui lòng nhập ID: ");
        String id = sc.nextLine();
        System.out.print("Vui lòng nhập họ và tên: ");
        String name = sc.nextLine();
        System.out.print("Vui lòng nhập ngày tháng năm sinh: ");
        String dateOfBirth = sc.nextLine();
        System.out.print("Vui lòng nhập giới tính (1:Nam 2:Nữ)");
        int genderOption = Integer.parseInt(sc.nextLine());
        boolean gender;
        if (genderOption == 1) {
            gender = true;
        } else {
            gender = false;
        }
        System.out.print("Vui lòng nhập lớp: ");
        String classes = sc.nextLine();
        System.out.print("Vui lòng nhập điểm: ");
        float grade = Float.parseFloat(sc.nextLine());
        Person person = new Student(id, name, dateOfBirth, gender, classes, grade);
        repository.addPerson(person);
        display();
    }

    public void addTeacher() {
        System.out.print("Vui lòng nhập ID: ");
        String id = sc.nextLine();
        System.out.print("Vui lòng nhập họ và tên: ");
        String name = sc.nextLine();
        System.out.print("Vui lòng nhập ngày tháng năm sinh: ");
        String dateOfBirth = sc.nextLine();
        System.out.print("Vui lòng nhập giới tính (1:Nam 2:Nữ)");
        int genderOption = Integer.parseInt(sc.nextLine());

        boolean gender;
        if (genderOption == 1) {
            gender = true;
        } else {
            gender = false;
        }
        System.out.println("Vui lòng nhập chuyên môn:");
        String expertise = sc.nextLine();

        Person person = new Teacher(id, name, dateOfBirth, gender, expertise);
        repository.addPerson(person);
        display();
    }


    @Override
    public void delete() {
        System.out.print("Vui lòng nhập id bạn muốn xoá: ");
        String id = sc.nextLine();
        Person person = repository.getById(id);
        if (person == null) {
            System.out.println("Không tìm thấy ID " + id);
        } else {
            System.out.println("Bạn có chắc muốn xoá ID: " + id + " không? \n" +
                    "1. Có \n" +
                    "2. Không");
            int option = Integer.parseInt(sc.nextLine());
            if (option == 1) {
                repository.deletePerson(person);
                System.out.println("Xoá thành công!");
            }
        }
    }


    @Override
    public void display() {
        List<Person> list = repository.getAll();

        for (Person person : list) {
            if (person != null) {
                System.out.println(person);
            }
        }
    }
}
