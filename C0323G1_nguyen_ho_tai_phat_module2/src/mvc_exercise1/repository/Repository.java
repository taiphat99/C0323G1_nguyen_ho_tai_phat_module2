package mvc_exercise1.repository;

import mvc_exercise1.model.Person;
import mvc_exercise1.model.Student;
import mvc_exercise1.model.Teacher;

public class Repository {
    static Person[] studentList = new Student[10];
    static Person[] teacherList = new Teacher[10];
    static Person[] list = new Person[20];
    static{
        Student student1 = new Student("SMS1","Danny","12/1/2000",true,"C0323G1",90);
        Student student2 = new Student("SMS2","Ned","12/1/1999",true,"C0323G1",100);
        Student student3 = new Student("SMS3","Tony","22/1/1998",true,"C0323G1",80);
        Student student4 = new Student("SMS4","David","19/5/2001",true,"C0323G1",79);
        Student student5 = new Student("SMS5","Jenny","12/02/2003",false,"C0323G1",97);
        list[0] = student1;
        list[1] = student2;
        list[2] = student3;
        list[3] = student4;
        list[4] = student5;
    }
    static {
        Teacher teacher1 = new Teacher("TMS1","Kelvin","23/2/1989",true,"Java");
        Teacher teacher2 = new Teacher("TMS2","Kelly","26/5/1994",false,"NodeJS");
        Teacher teacher3 = new Teacher("TMS3","Gorge","03/3/1989",true,"Python");
        list[5] = teacher1;
        list[6] = teacher2;
        list[7] = teacher3;
    }
    public Person[] getList(){
        return list;
    }

}
