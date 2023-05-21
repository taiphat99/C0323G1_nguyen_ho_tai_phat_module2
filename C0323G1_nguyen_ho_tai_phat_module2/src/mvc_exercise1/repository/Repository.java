package mvc_exercise1.repository;

import mvc_exercise1.model.Person;
import mvc_exercise1.model.Student;
import mvc_exercise1.model.Teacher;
import mvc_exercise1.repository.impl.IRepository;

import java.util.ArrayList;
import java.util.List;

public class Repository implements IRepository {
    static List<Person> personList = new ArrayList<>();
    static{
        Person student1 = new Student("SMS1","Danny","12/1/2000",true,"C0323G1",90);
        Person student2 = new Student("SMS2","Ned","12/1/1999",true,"C0323G1",100);
        Person student3 = new Student("SMS3","Tony","22/1/1998",true,"C0323G1",80);
        Person teacher1 = new Teacher("TMS1","Kelvin","23/2/1989",true,"Java");
        Person teacher2 = new Teacher("TMS2","Kelly","26/5/1994",false,"NodeJS");
        personList.add(student1);
        personList.add(student2);
        personList.add(student3);
        personList.add(teacher1);
        personList.add(teacher2);
    }

    @Override
    public List<Person> getAll() {
        return personList;
    }

    @Override
    public void addPerson(Person person) {
        personList.add(person);
    }

    @Override
    public void deletePerson(Person person) {
        personList.remove(person);
    }

    @Override
    public Person getById(String id) {
        return null;
    }

}
