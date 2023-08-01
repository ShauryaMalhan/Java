package Recursion.Subset_subsequence_string_questions;

import java.util.ArrayList;

public class Dice {
    public static void main(String[] args) {
        System.out.println(dice("", 4));
    }
    static ArrayList<String> dice(String p, int target){
        if(target == 0){
            ArrayList<String> obj = new ArrayList<>();
            obj.add(p);
            return obj;
        }
        ArrayList<String> obj = new ArrayList<>();
        for (int i = 1; i <= 6 && i <= target; i++) {
            obj.addAll(dice(p + i, target - i));
        }
        return obj;
    }
}
