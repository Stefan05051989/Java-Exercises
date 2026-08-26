package ClassAssignments.OddEvenTest1;

public class Exponent {
    public static int exponent(int base, int exp){
        int result = 1;
        for (int i = 0; i < exp; i++){
            result *= base;
        }
        return result;
    }
}
