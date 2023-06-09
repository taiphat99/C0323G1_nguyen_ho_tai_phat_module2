package furama_resort_management.utils.regex;

import java.time.LocalDate;
import java.time.Period;

public class Regex {
    public static final String CUSTOMER_ID_REGEX = "^KH-\\d{4}$";
    public static final String EMPLOYEE_ID_REGEX = "^NV-\\d{4}$";
    public static final String NAME_REGEX = "^((([A-Z]([a-z]+)|[A-Z])(\\s+|$))+)$";
    public static final String PHONE_NUMBER_REGEX = "^0\\d{9}$";
    public static final String IDENTITY_ID_REGEX = "^(\\d{9}|\\d{12})(\\s|$)";
    public static final String DATE_OF_BIRTH_REGEX = "^(19|20)\\d{2}\\-(0[1-9]|[1-9]|1[012])\\-([1-9]|1[0-9]|0[1-9]|2[0-9]|3[0-1])(\\s|$)";
    public static final String EMAIL_REGEX = "^([\\w-\\.]+)@(([\\w-]+\\.)+)[\\w-]{2,4}$";
    public static final String VILLA_CODE_REGEX = "^SVVL-\\d{4}$";
    public static final String HOUSE_CODE_REGEX = "^SVHO-\\d{4}$";
    public static final String ROOM_CODE_REGEX = "^SVRO-\\d{4}$";
    public static final String SERVICE_NAME_REGEX = "^[A-Z](([a-z]+|\\s|\\d)+)$";
    public static final String BOOKING_ID_REGEX = "^BK-\\d{4}$";



    public static boolean validate(String name, String regex) {
        return name.matches(regex);
    }

    public static boolean checkEighteenYearsOld(String dateOfBirth) {
        LocalDate localDate1 = LocalDate.parse(dateOfBirth);
        LocalDate localDate2 = LocalDate.now();
        return Period.between(localDate1, localDate2).getYears() >= 18;
    }
}
