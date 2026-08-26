package Com_PlayersGuide_KiersStefan.Utils.PrintMethods;

import static ClassAssignments.ChessBoardTwo.FILES;
import static Com_PlayersGuide_KiersStefan.Utils.Allignment.AllignBoard.center;

/**
 * PrintFileHeader
 * Challenge: Com_PlayersGuide_KiersStefan.Utils.PrintMethods
 *
 * @author Stefan Kiers
 * @since 21-8-2026
 */
public class PrintFileHeader {
    public static final int SQUARE_WIDTH = 3;
    public static final int RANK_WIDTH = 2;
    public static final String RANK_SEPERATOR = " ";

    public static void printFileHeader(){
        System.out.print(center("", RANK_WIDTH) + RANK_SEPERATOR);
        for (char file : FILES){
            System.out.print(center(String.valueOf(file), SQUARE_WIDTH));
        }
        System.out.println();
    }
}
