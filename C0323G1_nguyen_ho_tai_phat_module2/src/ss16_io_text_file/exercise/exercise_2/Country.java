package ss16_io_text_file.exercise.exercise_2;

import java.util.Objects;

public class Country {
    private int id;
    private String abbreviation;
    private String countryName;

    public Country() {
    }

    public Country(int id, String abbreviation, String countryName) {
        this.id = id;
        this.abbreviation = abbreviation;
        this.countryName = countryName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAbbreviation() {
        return abbreviation;
    }

    public void setAbbreviation(String abbreviation) {
        this.abbreviation = abbreviation;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Country country = (Country) o;
        return Objects.equals(countryName, country.countryName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(countryName);
    }

    @Override
    public String toString() {
        return "Country{" +
                "id=" + id +
                ", Abbreviation='" + abbreviation + '\'' +
                ", countryName='" + countryName + '\'' +
                '}';
    }
    public String getInfoCountry(){
        return this.id + "," + this.abbreviation + "," + this.countryName;
    }
}
