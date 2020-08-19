package xyz.edu;

import java.util.logging.Logger;

public class PalindromeService {
    private static final Logger LOGGER = Logger.getLogger(Rectangle.class.getName());
    private static final String regex = "[^a-zA-Z]";


    private static String getReversed(String string) {
        return new StringBuilder(string).reverse().toString();
    }

    private static String cleanString(String stringToClean){
        if (stringToClean == null){return null;}
        return stringToClean.toLowerCase()
                            .replaceAll("[^A-Za-z0-9]", "");

    }

    public static Boolean isValid(String string) {
        LOGGER.info("Create validation: if string is a palindrome");

        if (string == null) {
            return null;
        } else if (string.length() == 0) {
            return false;
        }

        String cleanedString = cleanString(string);
        LOGGER.info("Cleaned string: " + cleanedString);
        return getReversed(cleanedString).equals(cleanedString);
    }

}
