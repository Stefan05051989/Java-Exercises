package Com_PlayersGuide_KiersStefan.CodingExerciseAnalyzer;

/**
 * Challenge_06_DoubleArethmaticContinued
 * Challenge: Com_PlayersGuide_KiersStefan.CodingExerciseAnalyzer
 *
 * @author Stefan Kiers
 * @since 15-1-2026
 */
public class Challenge_06_DoubleArethmaticContinued {

    public static void main(String[] args) {
        double result = (4.0 * (1 - (1.0/3) + (1.0/5) - (1.0/7) + (1.0/9) - (1.0/11)));
        System.out.println(result);

        double pi = 0.0;
        int sign = 1;
        int steps = 0;

        for (int i = 1; ; i += 2){
            pi += sign * (4.0 / i);
            sign *= -1;
            steps++;

            if (Math.abs(pi - 3.14) < 0.005){
                break;
            }
        }
        System.out.println("pi = " + pi);
        System.out.println("steps = " + steps);
        /*
        3.13 = 152
        3.15 = 75
        3.14 not possible.
         */
    }
}
