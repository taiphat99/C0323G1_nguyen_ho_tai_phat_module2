package ss16_io_text_file.exercise.exercise_2;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        WriteCountry writeCountry = new WriteCountry();
        ReadCountry readCountry = new ReadCountry();
        List<Country> countryList = new ArrayList<>();
        Country country1 = new Country(1, "AU", "Australia");
        Country country2 = new Country(3, "VN", "VietNam");
        Country country3 = new Country(4, "AU", "Australia");
        Country country4 = new Country(5, "US", "United State");
        Country country5 = new Country(6, "VN", "VietNam");
        Country country6 = new Country(8, "TL", "ThaiLand");
        countryList.add(country1);
        countryList.add(country2);
        countryList.add(country3);
        countryList.add(country4);
        countryList.add(country5);
        countryList.add(country6);
        writeCountry.writeToCountryFile("src/ss16_io_text_file/exercise/exercise_2/CountList.csv", countryList);
        Set<Country> countries = readCountry.readCountrySetFromFile("src/ss16_io_text_file/exercise/exercise_2/CountList.csv");
        for (Country i :countries) {
            System.out.println(i);
        }
    }
}
