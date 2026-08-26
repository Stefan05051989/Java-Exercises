package CodingExerciseAnalyzer;

/**
 * Challenge_14_AreaAndPerimeterOfCircle
 * Challenge: Com_PlayersGuide_KiersStefan.CodingExerciseAnalyzer
 *
 * @author Stefan Kiers
 * @since 15-1-2026
 */
public class Challenge_14_AreaAndPerimeterOfCircle {

    public static void main(String[] args) {
        /* TODO: create a program that calculates the area and perimeter of a circle :
            - 1 : measure the radius
            - 2 : square it by multiplying by itself
            - 3 : multiply by pi.
         */
        double radius = 7.5;
        double area = Math.PI * Math.pow(radius, 2);
        double perimeter = 2 * Math.PI * radius;

        System.out.println("Perimeter : " + perimeter);
        System.out.println("Area : " + area);
    }
}
