package mvc_exercise_1.data;

import mvc_exercise_1.model.Person;
import mvc_exercise_1.model.ext.Student;
import mvc_exercise_1.model.ext.Teacher;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ManipulateFile {
    public void writeToFile(String path, List<Person> personList) {
        File file = new File(path);
        try {
            FileWriter fileWriter = new FileWriter(file);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            for (Person person : personList) {
                bufferedWriter.write(person.getInfoPerson());
                bufferedWriter.newLine();
            }
            bufferedWriter.flush();
            bufferedWriter.close();
            fileWriter.close();
        } catch (FileNotFoundException f) {
            System.err.println("File doesn't exist!");
        } catch (IOException i) {
            System.err.println("IO Text File Fault!");
        }
    }
    public List<Person> readFromFile(String path) {
        List<Person> personList = new ArrayList<>();
        File file = new File(path);
        try {
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line = "";
            while ((line = bufferedReader.readLine()) != null) {
                try {
                    String[] array = line.split(",");
                    if (array.length == 6) {
                        Person person = new Student(array[0], array[1], array[2], Boolean.parseBoolean(array[3]), array[4], Float.parseFloat(array[5]));
                        personList.add(person);
                    } else if (array.length == 5) {
                        Person person = new Teacher(array[0], array[1], array[2], Boolean.parseBoolean(array[3]), array[4]);
                        personList.add(person);
                    }
                } catch (IndexOutOfBoundsException i) {
                    System.err.println("Error!");
                }
            }
        } catch (FileNotFoundException f) {
            System.err.println("File doesn't exist!");
        } catch (IOException i) {
            System.err.println("Error!");
        }
        return personList;
    }
}
