package ss16_io_text_file.exercise.exercise_1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ReadAndWriteTextFile readAndWriteTextFile = new ReadAndWriteTextFile();
        List<Character> charList = readAndWriteTextFile.readFileText("src/ss16_io_text_file/exercise/exercise_1/TextFile");

        for (Character i : charList) {
            System.out.print(i);
            System.out.println();
        }
        System.out.println("The number of characters is : " + charList.size());
    }
}

