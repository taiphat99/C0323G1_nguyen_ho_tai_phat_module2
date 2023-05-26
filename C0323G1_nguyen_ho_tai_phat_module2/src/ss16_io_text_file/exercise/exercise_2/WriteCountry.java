package ss16_io_text_file.exercise.exercise_2;

import java.io.*;
import java.util.List;

public class WriteCountry {
    public void writeToCountryFile(String path, List<Country> countries) {
        File file = new File(path);
        try {
            FileWriter fileWriter = new FileWriter(file);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            for (int i = 0; i < countries.size(); i++) {
                bufferedWriter.write(countries.get(i).getInfoCountry());
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
}