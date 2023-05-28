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
        Student person1 = new Student("SMS1", "Danny", "12/2/2002", true, "C0323G1", 9.9f);
        Student person2 = new Student("SMS2", "Louis", "12/2/2002", true, "C0323G1", 9.1f);
        Student person3 = new Student("SMS3", "Ned", "12/2/2002", true, "C0323G1", 9.3f);
        Student person4 = new Student("SMS4", "Tony", "12/2/2002", true, "C0323G1", 8.9f);
        students.add(person1);
        students.add(person2);
        students.add(person3);
        students.add(person4);
        manipulateFile.writeToFile("src/mvc_exercise_1/data/Students.csv", students);
        students = manipulateFile.readFromFile("src/mvc_exercise_1/data/Students.csv");

        Teacher person5 = new Teacher("TMS1", "Jamie", "12/2/2002", false, "Math");
        Teacher person6 = new Teacher("TMS2", "Gage", "12/2/2002", true, "Geography");
        Teacher person7 = new Teacher("TMS3", "Kenny", "12/2/2002", false, "Psychology");
        teachers.add(person5);
        teachers.add(person6);
        teachers.add(person7);
        manipulateFile.writeToFile("src/mvc_exercise_1/data/Teachers.csv", teachers);
        teachers = manipulateFile.readFromFile("src/mvc_exercise_1/data/Teachers.csv");
        people.addAll(students);
        people.addAll(teachers);
    }

    @Override
    public void add(Person person) {
        people.add(person);
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
        return teachers;
    }

    @Override
    public List<Person> displayStudentList() {
        return students;
    }


}
