package Com_PlayersGuide_KiersStefan.Utils.Allignment;

/**
 * AllignBoard
 * Challenge: Com_PlayersGuide_KiersStefan.Utils.Allignment
 *
 * @author Stefan Kiers
 * @since 21-8-2026
 */
public class AllignBoard {
    public static String center(String text, int width){
        int totalPadding = width - text.length();
        int left = totalPadding / 2;
        int right = totalPadding - left;
        return spaces(Math.max(left, 0)) + text + spaces(Math.max(right, 0));
    }

    private static String spaces(int count) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < count; i++){
            builder.append(' ');
        }
        return builder.toString();
    }
}
