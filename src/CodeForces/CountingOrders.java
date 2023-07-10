package CodeForces;

import java.util.*;

public class CountingOrders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            List<Long> a = new ArrayList<>();
            List<Long> b = new ArrayList<>();
            long m = 1000000007;

            for (int i = 0; i < n; i++) {
                long d = scanner.nextLong();
                a.add(d);
            }
            for (int i = 0; i < n; i++) {
                long d = scanner.nextLong();
                b.add(d);
            }

            Collections.sort(a);
            Collections.sort(b);

            Collections.reverse(a);
            Collections.reverse(b);

            long left = n;
            int index_a = 0;
            long ans = 1;
            for (int i = 0; i < n; i++) {
                for (int j = index_a; j < n; j++) {
                    if(b.get(i) < a.get(j)){
                        index_a++;
                    }else{
                        break;
                    }
                }
            }
            System.out.println(ans);
        }
    }
}
