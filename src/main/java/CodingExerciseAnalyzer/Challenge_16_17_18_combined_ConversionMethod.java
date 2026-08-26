package CodingExerciseAnalyzer;

import ClassAssignments.Exceptions.InputValidator;

/**
 * Challenge_16_17_18_combined_ConversionMethod
 * Challenge: CodingExerciseAnalyzer
 *
 * @author Stefan Kiers
 * @since 18-8-2026
 */
/* TODO: TYPE HERE
 *   - additions
 */
class Challenge_16_17_18_combined_ConversionMethod {
    static String convertInput(String input, int fromBase, int toBase){
        int value = InputValidator.safeParseInt(input, fromBase);
        return Integer.toString(value,toBase);
    }

    public static void main(String[] args) {
        System.out.println(convertInput("1101", 2,16));
        System.out.println(convertInput("13", 10,16));
        System.out.println(convertInput("13", 10,8));

        // test wrong input :
        System.out.println(convertInput("1b1101", 2,16));
    }
}
