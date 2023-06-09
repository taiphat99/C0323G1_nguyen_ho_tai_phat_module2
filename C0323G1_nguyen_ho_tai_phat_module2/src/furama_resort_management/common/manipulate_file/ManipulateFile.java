package furama_resort_management.common.manipulate_file;


import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ManipulateFile {


    public static List<String> readFromFile(String path) {
        List<String> stringList = new ArrayList<>();
        try {
            FileReader fileReader = new FileReader(path);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line = "";
            while ((line = bufferedReader.readLine()) != null) {
                stringList.add(line);
            }
            bufferedReader.close();
        } catch (FileNotFoundException f) {
            System.err.println("File doesn't exist!");
        } catch (IOException i) {
            System.err.println("Error!");
        }
        return stringList;
    }

    public static void writeToFile(String path, List<String> stringList, boolean append) {
        try {
            FileWriter fileWriter = new FileWriter(path, append);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            for (String i : stringList) {
                bufferedWriter.write(i);
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
        } catch (FileNotFoundException f) {
            System.err.println("File doesn't exist!");
        } catch (IOException i) {
            System.err.println("Error!");
        }
    }
}
