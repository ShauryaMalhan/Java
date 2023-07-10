package Linear_search;

import java.util.Arrays;

public class Searchin2D {
    public static void main(String[] args) {
        int[][] arr = {
                {3, 4, 5},
                {23, 56, 56, 67},
                {45, 67, 34, 89, 100},
        };
        int target = 56;
        int[] ans = search(arr, target);
        System.out.println(Arrays.toString(ans));
        System.out.println(Integer.MIN_VALUE); //Important
        System.out.println(Integer.MAX_VALUE);
    }
    static int[] search(int[][] arr, int target){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i].length == 0){
                return new int[]{-1};
            }
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                int element = arr[i][j];
                if(element == target){
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{-1};
    }
}
