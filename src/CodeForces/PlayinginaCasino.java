package CodeForces;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class PlayinginaCasino {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-- > 0){
            int n = in.nextInt();
            int m = in.nextInt();
            ArrayList<ArrayList<Long>> obj = new ArrayList<>();
            for (int i = 0; i < m; i++) {
                obj.add(new ArrayList<>());
            }
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    obj.get(j).add(in.nextLong());
                }
            }
            long sum = 0;
            for (int i = 0; i < m; i++) {
                Collections.sort(obj.get(i));
            }
            for (int i = 0; i < m; i++) {
                long[] res = new long[n];
                res[n - 1] = obj.get(i).get(n - 1);
                for (int j = n - 2; j >= 0; j--) {
                    res[j] = res[j + 1] + obj.get(i).get(j);
                }
                for (int j = 0; j < n - 1; j++) {
                    sum += res[j + 1] - (n - 1 - j) * obj.get(i).get(j);
                }
            }
            System.out.println(sum);
        }
    }
}
