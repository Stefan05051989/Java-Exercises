package Com_PlayersGuide_KiersStefan.Utils.ShapesAndMatrixes;

/**
 * ShapePrograms
 * Challenge: Com_PlayersGuide_KiersStefan.Utils.ShapesAndMatrixes
 *
 * @author Stefan Kiers
 * @since 21-8-2026
 */
public class ShapePrograms {
    public static String[][] buildStartPosition() {
        String[][] board = new String[8][8];
        for (String[] row : board) {
            java.util.Arrays.fill(row, "");
        }
        // achterste rij =
        String[] backRow = {"R", "N", "B", "Q", "K", "B", "N", "R"};
        for (int col = 0; col < 8; col++){
            board[0][col] = backRow[col]; // zwart, rij 8
            board[1][col] = "P";            // zwarte pionnen : rij 7
            board[6][col] = "P";            // witte pionnen : rij 2
            board[7][col] = backRow[col]; // wit, rij 1
        }
        return board;
    }
}
