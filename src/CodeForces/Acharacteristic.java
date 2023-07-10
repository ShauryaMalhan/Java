package CodeForces;

import java.util.Scanner;

public class Acharacteristic {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-- > 0){
            int n = in.nextInt();
            int k = in.nextInt();
            int[] arr = new int[n + 1];
            int[] arr1 = new int[n + 1];
            for (int i = 0; i < n + 1; i++) {
                arr[i] = value(i);
            }
            for (int i = 0; i < n + 1; i++) {
                arr1[n - i] = value(i);
            }
            for (int i = 0; i < n + 1; i++) {
                arr1[i] += arr[i];
            }
            String ans = "NO";
            int mid = arr1.length / 2;
            int p = 0;
            for (int i = 0; i <= mid; i++) {
                if (arr1[i] == k) {
                    ans = "YES";
                    p = i;
                    break;
                }
            }
            System.out.println(ans);
            if(ans.equals("YES")){
                int[] final1 = new int[n];
                for (int i = 0; i < p; i++) {
                    final1[i] = -1;
                    System.out.print(final1[i] + " ");
                }
                for (int i = p; i < n; i++) {
                    final1[i] = 1;
                    System.out.print(final1[i] + " ");
                }
                System.out.println();
            }
        }
    }
    static int value(int a){
        return ((a - 1) * a) / 2;
    }
}
