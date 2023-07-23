package CodeForces;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Lamps {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-- > 0){
            int n = in.nextInt();
            ArrayList<ArrayList<Integer>> obj = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                obj.add(new ArrayList<>());
            }
            for (int i = 0; i < n; i++) {
                int a = in.nextInt();
                int b = in.nextInt();
                obj.get(a - 1).add(b);
            }
            long ans = 0;
            for (int i = 0; i < n; i++) {
                Collections.sort(obj.get(i), Collections.reverseOrder());
                for (int j = 0; j < Math.min(i + 1, obj.get(i).size()); j++) {
                    ans += obj.get(i).get(j);
                }
            }
            System.out.println(ans);
        }
    }
}