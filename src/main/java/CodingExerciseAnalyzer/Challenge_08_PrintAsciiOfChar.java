package CodingExerciseAnalyzer;

import java.util.Scanner;

/**
 * Challenge_08_PrintAsciiOfChar
 * Challenge: Com_PlayersGuide_KiersStefan.CodingExerciseAnalyzer
 *
 * @author Stefan Kiers
 * @since 15-1-2026
 */
class Challenge_08_PrintAsciiOfChar {

    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a character: ");
        char asciiOfChar = scanner.next().charAt(0);
        System.out.println("Ascii value = " + (int) asciiOfChar);
    }
}
