package ClassAssignments;

import ClassAssignments.Exceptions.InputValidator;

import java.util.ArrayList;
import java.util.Scanner;
import Utils.Strings.StringUtils;
/*
Stefan Kiers
08-07-'25

Write a program called PrintArray that asks the user for the
number of items in an array (a non-negative integer) and stores it in an int variable called NUM_ITEMS.
 It then asks the user for the values of all the items and stores them in an int array called
items. The program will then print the contents of the array in the form of [x1, x2, ..., xn]

Bonus :
Have the program print the contents of the array in a graphical form,
 with the values represented by the number of stars.
 (Example :
 *** (3)
 **(2)
 *(1)
 */


public class PrintArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        final int NUM_ITEMS = InputValidator.askForNonNegativeNumber(input, "How many items? \nInput : ");

        ArrayList<Integer> items = new ArrayList<>();
        for (int i = 1; i <= NUM_ITEMS; i++) {
            int value = InputValidator.askForNonNegativeNumber(input, "Please enter " + i + " : ");
            items.add(value);
        }
        System.out.println(items);

        // bonus
        for(int value : items) {
            System.out.println(StringUtils.repeat("*", value) + " (" + value + ") ");
        }
    }
}

