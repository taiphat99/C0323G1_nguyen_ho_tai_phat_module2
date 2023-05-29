package mvc_exercise_1.repository.impl;

import mvc_exercise_1.model.Person;
import mvc_exercise_1.model.ext.Student;
import mvc_exercise_1.model.ext.Teacher;
import mvc_exercise_1.repository.ICodeGymRepository;
import mvc_exercise_1.data.ManipulateFile;

import java.util.ArrayList;
import java.util.List;

public class CodeGymRepository implements ICodeGymRepository {
    private static final List<Person> people = new ArrayList<>();
    private static List<Person> students = new ArrayList<>();
    private static List<Person> teachers = new ArrayList<>();
    private static final ManipulateFile manipulateFile = new ManipulateFile();

    @Override
    public void addStudent(Student student) {
        manipulateFile.readFromFile("src/mvc_exercise_1/data/Students.csv");
        students.add(student);
        manipulateFile.writeToFile("src/mvc_exercise_1/data/Students.csv", students);
    }

    @Override
    public void addTeacher(Teacher teacher) {
        manipulateFile.readFromFile("src/mvc_exercise_1/data/Teachers.csv");
        teachers.add(teacher);
        manipulateFile.writeToFile("src/mvc_exercise_1/data/Teachers.csv", teachers);
    }

    @Override
    public void removeStudent(Person student) {
        students = manipulateFile.readFromFile("src/mvc_exercise_1/data/Students.csv");
        students.remove(student);
        manipulateFile.writeToFile("src/mvc_exercise_1/data/Students.csv", students);
    }

    @Override
    public void removeTeacher(Person teacher) {
        teachers = manipulateFile.readFromFile("src/mvc_exercise_1/data/Teachers.csv");
        teachers.remove(teacher);
        manipulateFile.writeToFile("src/mvc_exercise_1/data/Teachers.csv",teachers);
    }

    @Override
    public Person checkIdTeacher(String id) {
        teachers = manipulateFile.readFromFile("src/mvc_exercise_1/data/Teachers.csv");
        for (Person i : teachers) {
            if (i.getId().equals(id)) {
                return i;
            }
        }
        return null;
    }
    @Override
    public Person checkIdStudent(String id){
        students = manipulateFile.readFromFile("src/mvc_exercise_1/data/Students.csv");
        for (Person i: students){
            if(i.getId().equals(id)){
                return i;
            }
        }return null;
    }

    @Override
    public List<Person> searchByName(String name) {
        List<Person> findingList = new ArrayList<>();
        for (Person p : people) {
            if (p.getName().toLowerCase().contains(name.toLowerCase())) {
                findingList.add(p);
            }
        }
        if (findingList.size() == 0) {
            return null;
        } else {
            return findingList;
        }
    }

    @Override
    public List<Person> displayAll() {
        people.addAll(manipulateFile.readFromFile("src/mvc_exercise_1/data/Teachers.csv"));
        people.addAll(manipulateFile.readFromFile("src/mvc_exercise_1/data/Students.csv"));
        return people;
    }

    @Override
    public List<Person> displayTeacherList() {
        return manipulateFile.readFromFile("src/mvc_exercise_1/data/Teachers.csv");
    }

    @Override
    public List<Person> displayStudentList() {
        return manipulateFile.readFromFile("src/mvc_exercise_1/data/Students.csv");
    }


    @Override
    public void updateStudent() {

    }

    @Override
    public void updateTeacher() {

    }


}
