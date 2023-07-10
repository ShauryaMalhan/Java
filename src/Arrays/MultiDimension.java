package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class MultiDimension {
    public static void main(String[] args) {
        /*
            1 2 3
            4 5 6
            7 8 9
         */
//        int [][] arr = new int[3][3];
//        imagine this as an array of arrays
        Scanner in = new Scanner(System.in);
        int[][] arr = {
                {1, 2, 4},
                {2, 3, 4},
                {5, 7, 1}
        };
        int[][] arr1 = {
                {1, 2, 4},
                {2, 3},
                {4, 5, 7, 1}
        };
        int[][] arr2 = new int[3][3];
        // input
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr2[i][j] = in.nextInt();
            }
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr2[i][j] + " ");
            }
            System.out.println();
        }
        for (int i = 0; i < arr.length; i++){
            System.out.println(Arrays.toString(arr2[i]));
        }
        for (int[] a : arr){
            System.out.println(Arrays.toString(a));
        }
    }
}
