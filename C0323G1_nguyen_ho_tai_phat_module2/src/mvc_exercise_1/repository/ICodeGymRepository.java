package mvc_exercise_1.repository;

import mvc_exercise_1.model.Person;

import java.util.List;

public interface ICodeGymRepository {
    void add(Person person);
    void remove(Person person);
    List displayAll();
    Person checkIdPerson(String id);
    List searchByName(String name);

    List<Person> displayTeacherList();

    List<Person> displayStudentList();
}
