package CodeForces;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Indivisible {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {
            int n = in.nextInt();
            if(n == 1){
                System.out.println(1);
            }else if(n % 2 != 0){
                System.out.println(-1);
            }else{
                ArrayList<Integer> arr = new ArrayList<>();
                for (int i = 1; i < n + 1; i++) {
                    arr.add(i);
                }
                for (int i = 0; i < n - 1; i++) {
                    if(i % 2 == 0){
                        swap(arr, i, i + 1);
                    }
                }
                for (int i = 0; i < n; i++) {
                    System.out.print(arr.get(i) + " ");
                }
                System.out.println();
            }
        }
    }
    static void swap(ArrayList<Integer> arr, int a, int b){
        Collections.swap(arr, a, b);
    }
}
