package mvc_exercise1.service;

import mvc_exercise1.model.Person;
import mvc_exercise1.model.Student;
import mvc_exercise1.model.Teacher;
import mvc_exercise1.repository.Repository;
import mvc_exercise1.service.impl.IService;

public class Service implements IService {
    private Repository repository = new Repository();
    @Override
    public void add() {

    }

    @Override
    public void delete() {

    }

    @Override
    public void display() {
    Person[] list = repository.getList();

        for (Person person:list) {
            if(person != null){
                System.out.println(person);
            }
        }
    }
}
