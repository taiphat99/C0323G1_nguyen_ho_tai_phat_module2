package ss16_io_text_file.practice.practice_1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();
        Student student1 = new Student("1", "Danny", "Math");
        Student student2 = new Student("2", "Louis", "Physics");
        Student student3 = new Student("3", "Ned", "Geography");
        studentList.add(student1);
        studentList.add(student2);
        studentList.add(student3);
        WriteFileExample.writeStudentListToFile("src/ss16_io_text_file/practice/practice_1/student.csv", studentList);
        List<Student> studentListFromFile = ReadFileExample.readStudentListFromFile("src/ss16_io_text_file/practice/practice_1/student.csv");
        for (Student student: studentListFromFile) {
            System.out.println(student);
        }
    }
}
