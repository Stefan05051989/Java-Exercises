package ClassAssignments.OddEvenTest1;

import java.util.Scanner;

import static ClassAssignments.OddEvenTest1.Exponent.exponent;
import static ClassAssignments.OddEvenTest1.IsOdd.isOdd;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // int number; (different method in IsOdd)
        int evenTotal = 0;
        int oddTotal = 0;

        if (args.length % 2 != 0){
            System.out.println("Enter a number as argument : ");
            return;
        }
        for (int i = 0; i < args.length; i+= 2){
            int base = Integer.parseInt(args[i + 1]);
            int exp = Integer.parseInt(args[i + 1]);

            int result = exponent(base,exp);
            System.out.println(base + "" + exp + " = " + result);

            if (isOdd(result)){
                oddTotal += result;
            }else {
                evenTotal += result;
            }
        }
        System.out.println("Even Total : " + evenTotal);
        System.out.println("Odd Total : " + oddTotal);

        scanner.close();
    }
}
