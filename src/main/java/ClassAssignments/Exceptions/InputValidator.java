package ClassAssignments.Exceptions;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * InputValidator
 * Challenge: ClassAssignments.Exceptions
 *
 * @author Stefan Kiers
 * @since 20-8-2026
 */
/* TODO: klasse voor afhandelen van verschillende soorten incorrecte input.
 */
public class InputValidator {
    // vraag om geheel getal, blijft doorgaan tot input geldig is.
    public static int askForInt(Scanner input, String text){
        while (true){
            System.out.println(text);
            try {
                return input.nextInt();
            }catch (InputMismatchException e){
                System.out.println("Please enter an integer value");
                input.next();
            }
        }
    }
    // vraag geheel getal of hoger
    public static int askForNonNegativeNumber(Scanner input, String text){
        while (true){
            int value = askForInt(input, text); // roept askForInt methode aan.
            if (value >= 0){
                return value;
            }
            System.out.println("Please enter a non-negative integer value");
        }
    }
    // integer in bereik van min / max
    public static int askForIntInRange(Scanner input, String text, int min, int max){
        while (true){
            int value = askForInt(input, text);
            if (value >= min && value <= max){
                return value;
            }
            System.out.println("Please enter value between " + min + " and " + max);
        }
    }

    // parse string naar getal
    public static int stringParseInt(String input, int number){
        try {
            return Integer.parseInt(input, number);
        }catch (NumberFormatException e){
            throw new IllegalArgumentException(
                    "\"" + input + "\" is not a valid integer value " + number, e);
        }
    }
    // parse String to int in gegeven talstelsel.
    public static int safeParseInt(String input, int number){
        try {
            return Integer.parseInt(input, number);
        }catch (NumberFormatException e){
            throw new IllegalArgumentException("\"" + input + "\" is not a valid integer value " + number, e);
        }
    }
    // vraag om non-empty String, tot input geldig is.
    public static String askForNonEmptyStringNoTrim(Scanner input, String text){
        while (true){
            System.out.println(text);
            String value = input.nextLine();
            if (value != null && !value.isEmpty()){
                return value;
            }
            System.out.println("Please enter at least one valid character");
        }
    }
    public static String askForNonEmptyStringWithTrim(Scanner input, String text){
        while (true){
            System.out.println(text);
            String value = input.nextLine();
            if (value != null && !value.trim().isEmpty()){
                return value;
            }
            System.out.println("Please enter at least one valid character");
        }
    }
}
