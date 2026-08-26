package CodingExerciseAnalyzer;
import java.util.Scanner;

/**
 * Challenge_16_BinaryToHexadecimal
 * Challenge: CodingExerciseAnalyzer
 *
 * @author Stefan Kiers
 * @since 18-8-2026
 */
/* TODO: Write a Java program to convertInput a binary number to hexadecimal number.
        Input Data:
        Input a Binary Number: 1101
        Expected Output
        Hexadecimal value: D
 */
class Challenge_16_BinaryToHexadecimal {
    static void main(String[] args) {
        // as binary :
        System.out.println("As binary : ");
        int binary = 0b1101;
        String hexadecimal = Integer.toHexString(binary).toUpperCase();
        System.out.println("Hexa value (0b1101) : " + hexadecimal);
        System.out.println();

        // as string input
        System.out.println("As String : ");
        String binaryNumberAsString = "1101";
        int binaryString = Integer.parseInt(binaryNumberAsString, 2);
        String hexadecimalAsString = Integer.toHexString(binaryString).toUpperCase();
        System.out.println("hexa value : " + hexadecimalAsString);
    }
}
