package CodeForces;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class maximumSum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        while (T-- > 0) {
            int n = in.nextInt();
            int k = in.nextInt();
            ArrayList<Long> arr = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                arr.add(in.nextLong());
            }
            Collections.sort(arr);
            ArrayList<Long> final1 = new ArrayList<>();
            final1.add(arr.get(0));
            long sum = arr.get(0);
            for (int i = 1; i < n; i++) {
                sum += arr.get(i);
                final1.add(sum);
            }
            long ans = 0;
            long curr = 0;
            final1.add(0, curr);
            for (int i = 0; i <= k; i++) {
                ans = Math.max(ans, final1.get(n - i) - final1.get(2*(k - i)));
            }
            System.out.println(ans);
        }
    }
}