package CodeForces;

import java.util.ArrayList;
import java.util.Scanner;

public class GridReconstruction {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-- > 0){
            int n = in.nextInt();
            int m = 2 * n;
            int h = (2 * n) - 1;
            int[] arr = new int[n];
            int[] arr1 = new int[n];
            ArrayList<Integer> final1 = new ArrayList<>();
            for (int i = 1; i < n; i++) {
                int d = (int)Math.pow(-1, i);
                final1.add(2 * d * (i));
            }
            final1.add(0);
            for (int i = 0; i < n; i++) {
                arr[i] = (m) + final1.get(n - i - 1);
                m = arr[i];
                System.out.print(arr[i] + " ");
            }
            System.out.println();
            for (int i = 0; i < n; i++) {
                arr1[i] = h + final1.get(n - i - 1);
                h = arr1[i];
            }
            for (int i = n - 1; i >= 0 ; i--) {
                System.out.print(arr1[i] + " ");
            }
            System.out.println();
        }
    }
}
