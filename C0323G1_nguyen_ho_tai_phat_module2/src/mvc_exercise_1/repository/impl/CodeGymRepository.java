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

    static {
        people.addAll(manipulateFile.readFromFile("src/mvc_exercise_1/data/Teachers.csv"));
        people.addAll(manipulateFile.readFromFile("src/mvc_exercise_1/data/Students.csv"));
    }

    @Override
    public void addStudent(Student student) {
        students.add(student);
        manipulateFile.writeToFile("src/mvc_exercise_1/data/Students.csv",students);
    }

    @Override
    public void addTeacher(Teacher teacher) {
        teachers.add(teacher);
        manipulateFile.writeToFile("src/mvc_exercise_1/data/Teachers.csv", teachers);
    }

    @Override
    public void remove(Person person) {
        people.remove(person);
    }

    @Override
    public Person checkIdPerson(String id) {
        for (Person i : people) {
            if (i.getId().equals(id)) {
                return i;
            }
        }
        return null;
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
