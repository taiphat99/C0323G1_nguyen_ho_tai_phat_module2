package ss5_access_modifier_static_method_static_property.exercise.exercise_2;

public class Student {
    private String name = "John";
    private String classes = "C0323G1";
    Student(){

    }
    public void setName(String name){
        this.name = name;
    }
    public void setClasses(String classes){
        this.classes = classes;
    }
    public String getName(){
        return this.name;
    }
    public String getClasses(){
        return this.classes;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", classes='" + classes + '\'' +
                '}';
    }
}
