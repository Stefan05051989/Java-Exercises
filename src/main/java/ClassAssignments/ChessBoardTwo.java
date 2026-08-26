package ClassAssignments;

import static Com_PlayersGuide_KiersStefan.Utils.ShapesAndMatrixes.ShapePrograms.buildStartPosition;
import static Com_PlayersGuide_KiersStefan.Utils.PrintMethods.PrintBoard.printBoard;


/**
 * ChessBoardTwo
 * Challenge: ClassAssignments
 *
 * @author Stefan Kiers
 * @since 21-8-2026
 *
 * tweede versie van schaakbord, nu met layout ernaast ipv in de vakken.
 */
public class ChessBoardTwo {
    // geef waardes
    public static final char[] FILES = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H'};

    public static void main(String[] args) {
        System.out.println("startopstelling : ");
        printBoard(buildStartPosition());
    }
}
