package mvc_exercise_1.repository;

import mvc_exercise_1.model.Person;
import mvc_exercise_1.model.ext.Student;
import mvc_exercise_1.model.ext.Teacher;

import java.util.List;

public interface ICodeGymRepository {
    void removeStudent(Person student);
    void removeTeacher(Person teacher);
    List getAll();

    Person checkIdTeacher(String id);

    Person checkIdStudent(String id);

    List searchByName(String name);

    List<Person> getTeacherList();

    List<Person> getStudentList();
    void addStudent(Student student);
    void addTeacher(Teacher teacher);
    void updateStudent();
    void updateTeacher();
}
