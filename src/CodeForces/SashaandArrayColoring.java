package CodeForces;

import java.util.Arrays;
import java.util.Scanner;

public class SashaandArrayColoring {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-- > 0){
            int n = in.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = in.nextInt();
            }
            Arrays.sort(arr);
            int b = (n + 1) / 2 - 1;
            int ans = 0;
            for (int i = 0; i <= b; i++) {
                ans += Math.abs(arr[i] - arr[n - 1 - i]);
            }
            System.out.println(ans);
        }
    }
}
