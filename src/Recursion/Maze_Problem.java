package Recursion;

import java.util.ArrayList;

public class Maze_Problem {
    public static void main(String[] args) {
        String s = "";
        System.out.println(count(3, 3));
        // path(s, 3, 3);
        System.out.println(pathretdiagnol(s, 3, 3));
    }
    static int count(int r, int c){
        if(r == 1 || c == 1){
            return 1;
        }
        int diagnol = count(r - 1, c - 1);
        int right = count(r - 1, c);
        int down = count(r, c - 1);
        return right + down + diagnol;
    };
    static void path(String s, int r, int c){
        if(r == 1 && c == 1){
            System.out.println(s);
            return;
        }
        if(r > 1){
            path(s + 'D', r - 1, c);
        }
        if(c > 1){
            path(s + 'R', r, c - 1);
        }
        if(r > 1 && c > 1){
            path(s + 'd', r - 1, c - 1);
        }
    }
    static ArrayList<String> pathretdiagnol(String p, int r, int c){
        if(r == 1 && c == 1){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> list = new ArrayList<>();
        if(r > 1 && c > 1){
            list.addAll(pathretdiagnol(p + 'd', r - 1, c - 1));
        }
        if(r > 1){
            list.addAll(pathretdiagnol(p + 'D', r - 1, c));
        }
        if(c > 1){
            list.addAll(pathretdiagnol(p + 'R', r, c - 1));
        }
        return list;
    }
}