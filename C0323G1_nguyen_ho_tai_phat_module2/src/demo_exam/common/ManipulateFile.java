package demo_exam.common;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ManipulateFile {
    public static void writeToFile(String path, List<String> list, boolean append) {
        try {
            FileWriter fileWriter = new FileWriter(path, append);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            for (String s : list) {
                bufferedWriter.write(s);
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
        } catch (FileNotFoundException f) {
            System.err.println("File doesn't exist!");
        } catch (IOException i) {
            System.err.println("IO Exception!");
        }
    }

    public static List<String> readFromFile(String path) {
        List<String> stringList = new ArrayList<>();
        try {
            FileReader fileReader = new FileReader(path);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line = "";
            while ((line = bufferedReader.readLine()) != null) {
                stringList.add(line);
            }
        } catch (FileNotFoundException f) {
            System.err.println("File doesn't exist!");
        } catch (IOException i) {
            System.err.println("IO Exception!");
        }
        return stringList;
    }

}
