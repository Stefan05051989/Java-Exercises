package ClassAssignments.Utils.Strings;

/**
 * StringUtils
 * Challenge: ClassAssignments.Utils
 *
 * @author Stefan Kiers
 * @since 20-8-2026
 */
/* TODO: util class for Strings
 */
public class StringUtils {
    // repeat string voor X aantal keer (java 8-replacement voor String.repeat)
    public static String repeat(String text, int count) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < count; i++) {
            result.append(text);
        }
        return result.toString();
    }
}
