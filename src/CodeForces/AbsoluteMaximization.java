package CodeForces;

import java.util.Scanner;

public class AbsoluteMaximization {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-- > 0){
            int n = in.nextInt();
            int[] arr = new int[n];
            arr[0] = in.nextInt();
            int max = arr[0];
            int min = arr[0];
            for (int i = 1; i < n; i++) {
                arr[i] = in.nextInt();
                max = max | arr[i];
                min = min & arr[i];
            }
            System.out.println(max - min);
        }
    }
}
