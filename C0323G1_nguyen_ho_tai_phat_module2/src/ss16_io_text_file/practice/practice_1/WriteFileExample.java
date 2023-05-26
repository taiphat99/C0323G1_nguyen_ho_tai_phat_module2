package ss16_io_text_file.practice.practice_1;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteFileExample {
    static void writeToFile(String path, String messsage) {
        File file = new File(path);
        try {
            FileWriter fileWriter = new FileWriter(file);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(messsage);
        } catch(IOException e){
            throw new RuntimeException(e);
        }
    }
}
