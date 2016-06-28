
/**
 * A class for grid
 * Md. Riad Arifin
 */
public class grid {

    //creating private variables
    private static int width;
    private static int height;

    //a constructor to assign values 
    public grid(int width, int height) {
        this.width = width;
        this.height = height;
    }

    //a method to check values for x
    public static int isAlive(int i, int j, String[][] grid1) {
        int live=0;
        if (i != width - 1) {
            if (grid1[i + 1][j] == "x ") {
                ++live;
            }
        }
        if (i != 0) {
            if (grid1[i - 1][j] == "x ") {
                ++live;
            }
        }
        if (j != height - 1) {
            if (grid1[i][j + 1] == "x ") {
                ++live;
            }
        }
        if (j != 0) {
            if (grid1[i][j - 1] == "x ") {
                ++live;
            }
        }
        if (i != width - 1 && j != height - 1) {
            if (grid1[i + 1][j + 1] == "x ") {
                ++live;
            }
        }
        if (i != 0 && j != 0) {
            if (grid1[i - 1][j - 1] == "x ") {
                ++live;
            }
        }
        if (i != width - 1 && j != 0) {
            if (grid1[i + 1][j - 1] == "x ") {
                ++live;
            }
        }
        if (i != 0 && j != height - 1) {
            if (grid1[i - 1][j + 1] == "x ") {
                ++live;
            }
        }
        return live;
    }
}
