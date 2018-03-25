package patterns;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Identifier Rules:
 * 1) may not be null or empty
 * 2) first character must be a letter
 * 3) must contain only letters, digits, or underscores
 * 4) may not contain two or more consecutive underscores
 */
public class IdentifierPattern {

    private final static String regEx = "^[a-zA-Z][_0-9a-zA-Z]*";
    private final static String repeatedUnderscore = "__"; // used to reject consecutive underscores
    private final static Pattern pattern1 = Pattern.compile(regEx);

    /**
     * @param text - source to look for matching patterns
     * @param index - offset into text to look for matching pattern
     * @return length of matching text ( 0 -> no match, -1 -> empty source text)
     */
    public static int test(String text, int index){
        CharSequence offsettext = text.substring(index);
        if (offsettext.length() == 0) {
            return -1;
        }
        Matcher match1 = pattern1.matcher(offsettext);
        if (match1.lookingAt()) {
            String candidate = offsettext.subSequence(0, match1.end()).toString();
            int repeatedUnderscoreIndex = candidate.indexOf(repeatedUnderscore);
            if (repeatedUnderscoreIndex > 0) {
                return repeatedUnderscoreIndex + 1; // the first underscore is good, it the second that is bad
            } else {
                return candidate.length();
            }
        } else {
            return 0;
        }
    }

    /**
     * @param text- source to look for matching patterns
     * @return length of matching text ( 0 -> no match)
     */
    public static int test(String text){
        return test(text, 0);
    }


}
