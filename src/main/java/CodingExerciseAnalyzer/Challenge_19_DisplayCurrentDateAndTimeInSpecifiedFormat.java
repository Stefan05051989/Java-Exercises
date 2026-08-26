package CodingExerciseAnalyzer;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * Challenge_19_DisplayCurrentDateAndTimeInSpecifiedFormat
 * Challenge: CodingExerciseAnalyzer
 *
 * @author Stefan Kiers
 * @since 18-8-2026
 */
/* TODO: Write a Java program to display the current date time in specific format.
    Sample Output:
    Now: 2017/06/16 08:52:03.066
 */
class Challenge_19_DisplayCurrentDateAndTimeInSpecifiedFormat {
static DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss:ms");

    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        String formattedDate = now.format(formatter);
        System.out.println("Now : " +  formattedDate);
    }
}
