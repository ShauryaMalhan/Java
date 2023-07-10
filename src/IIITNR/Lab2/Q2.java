package IIITNR.Lab2;
import java.util.Scanner;
import java.util.*;

public class Q2 {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        List<Integer> denominations = Arrays.asList(5, 6, 7);
        int target = in.nextInt();
        int ways = coinCombinations(denominations, 0, target);
        System.out.print("Number of Different Varients of Group Composition: ");
        System.out.println(ways);
    }

    // Recursive approach
    public static int coinCombinations(List<Integer> denominations , int idx, int target){
        // Base Case
        if (target == 0) return 1;
        int ways = 0;
        for (int i = idx; i < denominations.size(); i++){
            // Counting ways if i-th denomination cam be included
            if (target - denominations.get(i) >=0 )
                ways += coinCombinations(denominations, i, target-denominations.get(i));
        }
        return ways;
    }
}