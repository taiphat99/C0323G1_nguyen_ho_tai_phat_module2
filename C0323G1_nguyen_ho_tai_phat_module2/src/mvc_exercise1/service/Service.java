package mvc_exercise1.service;

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
    Student[] studentList = (Student[]) repository.getStudentList();
    Teacher[] teacherList = (Teacher[]) repository.getTeacherList();

        for (Teacher teacher: teacherList) {
            if(teacher != null){
                System.out.println(teacher);
            }
        }
        for (Student student:studentList) {
            if(student != null){
                System.out.println(student);
            }
        }
    }
}
