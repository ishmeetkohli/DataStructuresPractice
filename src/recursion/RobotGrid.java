package recursion;

import java.util.Random;

public class RobotGrid {

    public static void main(String[] args) {

        int r = 10;
        int c = 10;

        Random rand = new Random();

        boolean[][] grid = new boolean[r][c];

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if (rand.nextFloat() < 0.70) {
                    grid[i][j] = true;
                } else {
                    grid[i][j] = false;
                }
            }
        }

        grid[0][0] = true;
        grid[r-1][c-1] = true;

        print2DArray(grid);

        int[][] path = new int[r][c];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                path[i][j] = 0;
            }
        }

        System.out.println("\n\n");

        if(pathExist(0, 0, grid, path)) {
            print2DArray(path);
        } else {
            System.out.println("Path not found");
        }
    }

    static boolean pathExist(int r, int c, boolean[][] grid, int[][] memo) {

        if (r == grid.length - 1 && c == grid[0].length - 1) {
            memo[r][c] = 1;
            return true;
        } else if (r == grid.length || c == grid[0].length || !grid[r][c]) {
            return false;
        }

        if (memo[r][c] == 0) {
            if (!pathExist(r + 1, c, grid, memo) && !pathExist(r, c + 1, grid, memo)) {
                memo[r][c] = -1;
            } else {
                memo[r][c] = 1;
            }
        }

        return memo[r][c] == 1 ? true : false;
    }

    static void print2DArray(boolean[][] grid) {
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                System.out.print(grid[i][j] + "\t");
            }
            System.out.println();
        }
    }

    static void print2DArray(int[][] grid) {
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                System.out.print(grid[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
