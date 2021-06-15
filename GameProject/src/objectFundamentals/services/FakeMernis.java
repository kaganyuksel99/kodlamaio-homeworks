package objectFundamentals.services;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FakeMernis {
    public static boolean validate(String identificationNumber) {

        String regex = "^[0-9]+$";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(identificationNumber);

        if (identificationNumber.length() < 11) {
            return false;
        } else if (matcher.matches() && !identificationNumber.startsWith("0")) {
            return true;
        } else {
            return false;
        }

    }
}
