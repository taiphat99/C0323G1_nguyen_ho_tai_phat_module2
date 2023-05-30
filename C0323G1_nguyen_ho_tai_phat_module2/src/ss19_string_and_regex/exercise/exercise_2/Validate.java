package ss19_string_and_regex.exercise.exercise_2;

public class Validate {
    public static boolean checkPhoneNumber(String phoneNumber, String regex){
        return phoneNumber.matches(regex);
    }
}
