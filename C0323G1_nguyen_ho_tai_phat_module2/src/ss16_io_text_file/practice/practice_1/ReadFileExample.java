package ss16_io_text_file.practice.practice_1;


import java.io.*;

public class ReadFileExample {
    public static void main(String[] args) {
        readFileText("src/ss16_io_text_file/practice/practice_1/student.csv");
    }

    public static void readFileText(String filePath) {
        try {
            File file = new File(filePath);
            if (!file.exists()) {
                throw new FileNotFoundException();
            }
            BufferedReader bf = new BufferedReader(new FileReader(file));
            String line = "";
            int sum = 0;
            while ((line = bf.readLine()) != null) {
                System.out.println(line);
                sum += Integer.parseInt(line);
            }
            bf.close();
            System.out.println("Sum = "+ sum);
        } catch (Exception e) {
            System.err.println("File doesn't exist!");
        }
    }

}
