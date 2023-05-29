package ss17_io_binary_file_and_serialization.exercise.exercise_2;

import java.io.*;
import java.nio.file.Files;

public class Main {
    public static void main(String[] args) {
        String str = "CÔ ĐƠN TRÊN SOFA | Hồ Ngọc Hà x Tăng Duy Tân | Trung Quân live cover at Soul of The Forest";
        writeToFile("src/ss17_io_binary_file_and_serialization/exercise/exercise_2/OriginalFile.dat",str);
        try {
            File originalFile = new File("src/ss17_io_binary_file_and_serialization/exercise/exercise_2/OriginalFile.dat");
            File destinationFile = new File ("src/ss17_io_binary_file_and_serialization/exercise/exercise_2/DestinationFile.dat");
            Files.copy(destinationFile.toPath(),originalFile.toPath());
            System.out.println(readFromFile("src/ss17_io_binary_file_and_serialization/exercise/exercise_2/DestinationFile.dat"));
        } catch (IOException e) {
            System.err.println("Error!");
        }
    }

    public static void writeToFile(String path, String message) {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(path);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(message);
            objectOutputStream.close();
            fileOutputStream.close();
        } catch (Exception e){
            System.err.println("Error!");
        }
    }
    public static String readFromFile(String path){
        String str = "";

        try{
            FileInputStream fileInputStream = new FileInputStream(path);
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            str = (String) objectInputStream.readObject();
        } catch (Exception e){
            System.err.println("Error!");
        }
        return str;
    }
}

