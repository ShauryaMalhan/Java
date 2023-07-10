package CodeForces;

import java.util.Scanner;

public class LongLong {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-- > 0){
            int n = in.nextInt();
            long[] arr = new long[n];
            for (int i = 0; i < n; i++) {
                arr[i] = in.nextLong();
            }
            int sum = 0;
            int d = 0;
            long ans = 0;
            for (int i = 0; i < n; i++) {
                if(arr[i] < 0){
                    d++;
                }else if(d != 0 && arr[i] > 0){
                    sum++;
                    d = 0;
                }
                if(i == n - 1 && d != 0){
                    sum++;
                }
                ans += Math.abs(arr[i]);
            }
            System.out.println(ans + " " + sum);
        }
    }
}
