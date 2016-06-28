
/**
 * Assignment 8
 * A program to play Game of Life
 * Md. Riad Arifin (A00395462), Mar 2016
 */
import java.io.*;
import java.util.*;

public class A8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //creating some variables
        Scanner kbd = new Scanner(System.in);
        int height, width, i = 0, j = 0;

        //taking value of width and height from user
        System.out.print("Please enter the grid width: ");
        width = kbd.nextInt();
        System.out.print("Please enter the grid height: ");
        height = kbd.nextInt();

        //creating a grid object g
        grid g = new grid(width, height);

        //creating arrays to store values of the grid
        String[][] grid1 = new String[width][height];
        String[][] grid2 = new String[width][height];

        //assigning values to grid
        for (i = 0; i < width; ++i) {
            for (j = 0; j < height; j++) {
                grid1[i][j] = ". ";
            }
        }

        //taking the co ordinates of the cells which will become alive
        System.out.print("Pick a cell to make live (-1 -1 to quit): ");
        int k = kbd.nextInt();
        int h = kbd.nextInt();

        if (k == -1 && h == -1) {
        } else {
            grid1[k][h] = "x ";
        }

        while (k != -1 && h != -1) {

            System.out.print("Pick a cell to make live (-1 -1 to quit): ");
            k = kbd.nextInt();
            h = kbd.nextInt();

            if (k == -1 && h == -1) {
            } else {
                grid1[k][h] = "x ";
            }
        }

        //taking the number of generation from the user
        System.out.print("Please enter the number of generations to display: ");
        int num = kbd.nextInt();

        //printing out initial grid
        System.out.println("\nInitial Grid");
        for (j = 0; j < height; j++) {
            for (i = 0; i < width; i++) {

                System.out.print(grid1[i][j]);
            }
            System.out.println();
        }

        //checking which cell will live, die or remain unchanged
        for (k = 1; k <= num; ++k) {

            System.out.println("\nGeneration: " + k);

            for (i = 0; i < width; i++) {
                for (j = 0; j < height; j++) {
                    //calling the method isAlive
                    int live = g.isAlive(i, j, grid1);

                    //assigning values to the grid
                    if (live == 3) {
                        grid2[i][j] = "x ";
                    } else if (live == 2) {
                        grid2[i][j] = grid1[i][j];
                    } else {
                        grid2[i][j] = ". ";
                    }
                }
            }

            //printing out the modified grid
            for (j = 0; j < height; j++) {
                for (i = 0; i < width; i++) {

                    System.out.print(grid2[i][j]);
                }
                System.out.println();
            }

            //making copy of the previous grid
            for (i = 0; i < width; i++) {
                for (j = 0; j < height; j++) {
                    grid1[i][j] = grid2[i][j];
                }
            }

        }
    }
}
