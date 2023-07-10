package CodeForces;

import java.util.Scanner;

public class OddQueries {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        StringBuilder ans = new StringBuilder();
        int t = in.nextInt();
        while(t-- > 0){
            int n = in.nextInt();
            int m = in.nextInt();
            long[] arr = new long[n];
            long[] sum = new long[n + 1];
            for (int i = 0; i < n; i++) {
                arr[i] = in.nextLong();
                sum[i + 1] = sum[i] + arr[i];
            }
            for (int i = 0; i < m; i++) {
                int l = in.nextInt();
                int r = in.nextInt();
                long k = in.nextLong();
                long temp = sum[n] + (r - l + 1) * k - (sum[r] - sum[l - 1]);
                if(temp % 2 != 0){
                    ans.append("yes\n");
                }else{
                    ans.append("no\n");
                }
            }
        }
        System.out.println(ans);
    }
}
