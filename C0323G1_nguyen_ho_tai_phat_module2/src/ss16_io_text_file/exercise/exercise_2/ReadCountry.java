package ss16_io_text_file.exercise.exercise_2;

import java.io.*;
import java.util.LinkedHashSet;
import java.util.Set;

public class ReadCountry {
    public Set<Country> readCountrySetFromFile(String path) {
        Set<Country> countrySet = new LinkedHashSet<>();
        File file = new File(path);
        try {

            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line = "";
            while ((line = bufferedReader.readLine()) != null){
                String[] countryArray = line.split(",");
                Country country = new Country(Integer.parseInt(countryArray[0]),countryArray[1],countryArray[2]);
                countrySet.add(country);
            }
            bufferedReader.close();
            fileReader.close();


        } catch (FileNotFoundException f) {
            System.err.println("File doesn't exist!");
        } catch (IOException i){
            System.err.println("IO Text File fault");
        }
        return countrySet;
    }
}
