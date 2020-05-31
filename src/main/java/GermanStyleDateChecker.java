import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GermanStyleDateChecker {

    private static final String DAY = "((0?\\d)|((1|2)\\d)|(3(0|1)))";
    private static final String MONTH = "((0?\\d)|(1\\d[0-2]))";
    private static final String YEAR = "((19|20)?\\d\\d)";

    private static final String SPACER = "(\\s|\\-|\\.)";

    private static final String DATE_PATTERN = "^" + DAY + SPACER + MONTH + SPACER + YEAR + "$";

    private static final Pattern datePattern = Pattern.compile(DATE_PATTERN);

    public static Matcher getMatcher(String dateString) {
        return datePattern.matcher(dateString);
    }
}
