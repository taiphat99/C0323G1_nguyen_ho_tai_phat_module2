package ss17_io_binary_file_and_serialization.exercise.exercise_1.data;

import ss17_io_binary_file_and_serialization.exercise.exercise_1.model.Product;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ManipulateFile {
    public void writeToFile(String path, List<Product> productList){
        try{
            FileOutputStream fileOutputStream = new FileOutputStream(path);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(productList);
            objectOutputStream.close();
            fileOutputStream.close();
        } catch (Exception e){
            System.err.println("Error");
        }
    }
    public List<Product> readFromFile(String path){
        List<Product> productList = new ArrayList<>();
        try {
            FileInputStream fileInputStream = new FileInputStream(path);
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            productList = (List <Product>)objectInputStream.readObject();
            objectInputStream.close();
            fileInputStream.close();
        } catch (ClassNotFoundException e) {
            System.err.println();
        } catch (Exception f){
            System.err.println("Error");
        }
        return productList;
    }
}
