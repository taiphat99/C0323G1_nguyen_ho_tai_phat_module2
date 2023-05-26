package ss16_io_text_file.exercise.exercise_1;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWriteTextFile {
    public List<Character> readFileText(String filePath) {
        List<Character> characterList = new ArrayList<>();
        try {
            File file = new File(filePath);
            if (!file.exists()) {
                System.err.println("File doesn't exist!");
            }
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line = "";
            while ((line = bufferedReader.readLine()) != null) {
                for (int i = 0; i < line.length(); i++) {
                    if (line.charAt(i) != ' ')
                        characterList.add(line.charAt(i));
                }
            }
            bufferedReader.close();
            fileReader.close();
        } catch (IOException ioException) {
            System.out.println("IO Exception (File not Found or errors else (check stack trace)");
            ioException.printStackTrace();
        }
        return characterList;
    }

}
