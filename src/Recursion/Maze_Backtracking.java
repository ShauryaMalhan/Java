package Recursion;

import java.util.ArrayList;

public class Maze_Backtracking {
    // When do we backtrack: we the function call is returned in the original function.
    public static void main(String[] args) {
        
    }
    // static ArrayList<String> pathretdiagnol(String p, int r, int c){
    //     if(r == 1 && c == 1){
    //         ArrayList<String> list = new ArrayList<>();
    //         list.add(p);
    //         return list;
    //     }
    //     ArrayList<String> list = new ArrayList<>();
    //     maze[r][c] = false;
    //     if(r > 1 && c > 1){
    //         list.addAll(pathretdiagnol(p + 'd', r - 1, c - 1));
    //     }
    //     if(r > 1){
    //         list.addAll(pathretdiagnol(p + 'D', r - 1, c));
    //     }
    //     if(c > 1){
    //         list.addAll(pathretdiagnol(p + 'R', r, c - 1));
    //     }
    //     maze[r][c] = true;
    //     return list;
    // }
}
