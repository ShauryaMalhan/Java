package Recursion;

import java.util.ArrayList;
import java.util.Arrays;

public class Maze_Backtracking {
    // When do we backtrack: we the function call is returned in the original function.
    public static void main(String[] args) {
        Boolean[][] board = {
            {true, true, true},
            {true, true, true},
            {true, true, true}
        };
        int[][] path = new int[board.length][board[0].length];
        allPath("", board, 0, 0, path, 1);
    }
    static void allPath(String p, Boolean[][] maze, int r, int c, int[][] path, int step){
        if(r == maze.length - 1 && c == maze[0].length - 1){
            path[r][c] = step;
            for(int[] arr : path){
                System.out.println(Arrays.toString(arr));
            }
            System.out.println(p);
            System.out.println();
            return;
        }
        if(!maze[r][c]){
            return;
        }
        // Considering this block in my path
        maze[r][c] = false;
        path[r][c] = step;
        if(r < maze.length - 1){
            allPath(p + 'D', maze, r + 1, c, path, step + 1);
        }
        if(c < maze[0].length - 1){
            allPath(p + 'R', maze, r, c + 1, path, step + 1);
        }
        if(r > 0){
            allPath(p + 'U', maze, r - 1, c, path, step + 1);
        }
        if(c > 0){
            allPath(p + 'L', maze, r, c - 1, path, step + 1);
        }
        // before the function gets removed remove the changes that were done
        maze[r][c] = true;
        path[r][c] = 0;
    }
}
