package ss16_io_text_file.practice.practice_1;


import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadFileExample {
    public static List<Student> readStudentListFromFile(String path) {
        List<Student> studentList = new ArrayList<>();
        File file = new File(path);
        try {
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line = "";
            while ((line = bufferedReader.readLine()) != null) {
                String[] arr = line.split(",");
                Student student = new Student(arr[0], arr[1], arr[2]);
                studentList.add(student);
            }
            bufferedReader.close();
            fileReader.close();

        } catch (FileNotFoundException e) {
            System.out.println("File doesn't exist");
        } catch (IOException e) {
            System.out.println("IO Text File Fault");
        }
        return studentList;

    }

}
