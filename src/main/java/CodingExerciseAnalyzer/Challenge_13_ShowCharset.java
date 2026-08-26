package CodingExerciseAnalyzer;

import java.nio.charset.Charset;

/**
 * Challenge_13_ShowCharset
 * Challenge: Com_PlayersGuide_KiersStefan.CodingExerciseAnalyzer
 *
 * @author Stefan Kiers
 * @since 15-1-2026
 */
public class Challenge_13_ShowCharset {

    public static void main(String[] args) {
        /* TODO: display all available charsets
            - mooier gemaakt door tabel van te printen :
            - formatted string met precentages, underscore + output
         */
        /* stringf - Structuur : "formatted string ("%-5s %-30s%n") // waardes...)
        deze : %-5s
        % = start van format
        s = string
        5 = veldbreedte van 5 tekens
        - = uitlijnen
        dus : "Nr"wordt Nr___ (3 x whitespace) om elke keer o p5 plekken uit te komen.

        %-30s%n deze
        % = start
        s = string
        30 tekens breed (vreemd want hij print ook de volledige charnaam met 5 tekens breed)
        - = links uitlijnen.

        %n is nieuwe regel in printf (\n als esacape)
         */
        System.out.printf("%-5s %-30s%n",  "Nr",  "Charset");
        System.out.println("_________________________________");
        int i = 1;
//        String charSet;
        System.out.println("List of char-sets");
        for (String charSet : Charset.availableCharsets().keySet()) {
            // keyset : Returns a Collection view of the values contained in this map.
            System.out.printf("%-5d %-30s%n", i++,  charSet);
        }
    }
}
