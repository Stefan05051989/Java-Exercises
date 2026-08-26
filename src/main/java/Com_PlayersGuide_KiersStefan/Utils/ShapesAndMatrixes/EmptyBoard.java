package Com_PlayersGuide_KiersStefan.Utils.ShapesAndMatrixes;

/**
 * EmptyBoard
 * Challenge: Com_PlayersGuide_KiersStefan.Utils.ShapesAndMatrixes
 *
 * @author Stefan Kiers
 * @since 21-8-2026
 */
public class EmptyBoard {
    public static String[][] buildEmptyBoard(){
        String[][] board = new String[8][8];
        for (String[] row : board){
            java.util.Arrays.fill(row, "");
        }
        return board;
    }
}
