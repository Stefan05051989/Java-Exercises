package Com_PlayersGuide_KiersStefan.Utils.PrintMethods;

import static Com_PlayersGuide_KiersStefan.Utils.Colours.Colours.*;
import static Com_PlayersGuide_KiersStefan.Utils.Allignment.AllignBoard.center;
import static Com_PlayersGuide_KiersStefan.Utils.PrintMethods.PrintFileHeader.*;

/**
 * PrintBoard
 * Challenge: Com_PlayersGuide_KiersStefan.Utils.PrintMethods
 *
 * @author Stefan Kiers
 * @since 21-8-2026
 */
public class PrintBoard {
    static final String RANK_SEPERATOR = " ";
    public static void printBoard(String[][] squares){
        printFileHeader();

        for (int row = 0; row < 8; row++){
            int rankNumber = 8 - row;
            String rankLabel = center(String.valueOf(rankNumber), RANK_WIDTH);
            System.out.print(rankLabel + RANK_SEPERATOR);

            for (int col = 0; col < 8; col++){
                boolean isDark = (row + col) % 2 == 0;
                String background = isDark ? DARK_BACKGROUND : LIGHT_BACKGROUND;
                String label = squares[row][col].isEmpty() ? "" : squares[row][col];
                String content = center(label, SQUARE_WIDTH);

                System.out.print(background + content + RESET);
            }
            System.out.println(RANK_SEPERATOR + rankLabel);
        }
        printFileHeader();
    }

}
