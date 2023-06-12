package demo_exam.utils;

public class Regex {
    public final static String ID_REGEX = "^MSP-\\d{4}$";
    public final static String ID_NAME = "^((([A-Z]([a-z]+)|[A-Z])(\\s+|$))+)$";
    public final static String DATE_REGEX = "^([1-9]|1[0-9]|0[1-9]|2[0-9]|3[0-1])\\/(0[1-9]|[1-9]|1[012])\\/(19|20)\\d{2}$";
    public static boolean validate(String name, String regex){
        return name.matches(regex);
    }
}
