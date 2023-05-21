package mvc_exercise1.repository.impl;

import mvc_exercise1.model.Person;
import java.util.List;

public interface IRepository {
    List<Person> getAll();
    void addPerson(Person person);
    void deletePerson(Person person);
    Person getById(String id);


}
