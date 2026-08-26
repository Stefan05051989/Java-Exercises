package CodingExerciseAnalyzer;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * Challenge_01_DisplayDateTime
 * Challenge: Com_PlayersGuide_KiersStefan.CodingExerciseAnalyzer
 *
 * @author Stefan Kiers
 * @since 15-1-2026
 */
public class Challenge_01_DisplayDateTime {

    public static void main(String[] args) {
        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println(dateTime);
        // Now with format.
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String newDateTime = dateTime.format(dateTimeFormatter);
        System.out.println(newDateTime);
    }
}
