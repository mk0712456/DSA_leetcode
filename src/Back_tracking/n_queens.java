package Back_tracking;

import java.util.ArrayList;
import java.util.List;

public class n_queens {
    public static boolean check(int[][] board, int i, int j, int n) {
        // Check column attack
        for (int r = 0; r < i; r++) {
            if (board[r][j] == 1) {
                return false;
            }
        }
        // Check left diagonal attack
        int r = i - 1, c = j - 1;
        while (r >= 0 && c >= 0) {
            if (board[r][c] == 1) {
                return false;
            }
            r--;
            c--;
        }
        // Check right diagonal attack
        r = i - 1;
        c = j + 1;
        while (r >= 0 && c < n) {
            if (board[r][c] == 1) {
                return false;
            }
            r--;
            c++;
        }
        return true;
    }

    public static void genrate_ways(int[][] board, int n, int i) {
        if (i == n) {
            printBoard(board, n);
            return; // Stop further recursion
        }

        for (int j = 0; j < n; j++) {
            if (check(board, i, j, n)) {
                board[i][j] = 1; // Place queen
                genrate_ways(board, n, i + 1); // Recur to place the rest
                board[i][j] = 0; // Backtrack
            }
        }
    }

    // Utility function to print the board
    public static void printBoard(int[][] board, int n) {
        for (int r = 0; r < n; r++) {
            for (int c = 0; c < n; c++) {
                System.out.print(board[r][c] + " ");
            }
            System.out.println();
        }
        System.out.println(); // Print an extra line after each solution
    }

    public static void main(String[] args) {
        int n = 4; // Change this to the desired value of N
        int[][] board = new int[n][n]; // Initialize the board with 0s

        genrate_ways(board, n, 0);
    }
}
