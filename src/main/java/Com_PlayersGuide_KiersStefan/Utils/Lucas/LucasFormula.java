package Com_PlayersGuide_KiersStefan.Utils.Lucas;

public class LucasFormula {
    // if : input > or = to 2, calculate lucas :
    public static int lucasFormula(int n) {
        // declare variable
        int Lucas;

        // formula for calculating lucas :
        if (n == 0) {
            Lucas = 2;
        } else if (n == 1) {
            Lucas = 1;
        } else {
            // recursion is a method where the method calls itself !
            // see fibonacci also.
            Lucas = lucasFormula(n - 1) + lucasFormula(n - 2);
        }
        // return outcome.
        return Lucas;
    }
}

