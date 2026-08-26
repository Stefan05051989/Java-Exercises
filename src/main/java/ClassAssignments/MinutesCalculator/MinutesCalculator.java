package ClassAssignments.MinutesCalculator;
import java.util.Scanner;
import ClassAssignments.Exceptions.InputValidator;

/*
Stefan Kiers
27-06-'25

Write a program that can convert years, months, weeks, days and hours into minutes.

// logic is incorrect, years do not add up to 525.600 minutes, adapt :
 */

public class MinutesCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int years = InputValidator.askForNonNegativeNumber(input, "How many years? \nInput : ");
        int months = InputValidator.askForNonNegativeNumber(input, "How many months? \nInput : ");
        int weeks = InputValidator.askForNonNegativeNumber(input, "How many weeks? \nInput : ");
        int days = InputValidator.askForNonNegativeNumber(input, "How many days? \nInput : ");
        int hours = InputValidator.askForNonNegativeNumber(input, "How many hours? \nInput : ");

        // now calculate the input like :
        final int MINUTES_PER_YEAR = 525_600;
        final int MINUTES_PER_MONTH = 43_800;
        final int MINUTES_PER_WEEK = 10_080;
        final int MINUTES_PER_DAY = 1_440;
        final int MINUTES_PER_HOUR = 60;

        long minutes = (long) years * MINUTES_PER_YEAR
                + (long) months * MINUTES_PER_MONTH
                + (long) weeks * MINUTES_PER_WEEK
                + (long) days * MINUTES_PER_DAY
                + (long) hours * MINUTES_PER_HOUR;

        // display minutes
        System.out.println(minutes);
        input.close();
    }
}
