package CodeForces;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class KarinaandArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-- > 0){
            int n = in.nextInt();
            ArrayList<Long> arr = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                arr.add(in.nextLong());
            }
            Collections.sort(arr);
            long end = 0;
            long start = 0;
            for (int i = 0; i < n; i++) {
                end = arr.get(n - 1) * arr.get(n - 2);
                start = arr.get(0) * arr.get(1);
            }
            System.out.println(Math.max(end, start));
        }
    }
}
