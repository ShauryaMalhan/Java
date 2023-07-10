package CodeForces;

import java.util.Arrays;
import java.util.Scanner;

public class TrustNobody1802A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        while(T-- > 0){
            int n = in.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = in.nextInt();
            }
            Arrays.sort(arr);
            int[] final1 = new int[n + 1];
            int sum = 1;
            if(arr.length == 1){
                final1[arr[0]] = 1;
            }
            for (int i = 1; i < n; i++) {
                if(arr[i] == arr[i - 1]) {
                    sum++;
                    if(i == arr.length - 1){
                        int curr = arr[i];
                        final1[curr] = sum;
                    }
                }else{
                    int curr = arr[i - 1];
                    final1[curr] = sum;
                    sum = 1;
                    if(i == arr.length - 1){
                        curr = arr[i];
                        final1[curr] = sum;
                    }
                }
            }
            int[] ans1 = new int[n + 1];
            int ans = 0;
            for (int i = 0; i < n + 1; i++) {
                if(final1[i] != 0){
                    ans1[i] = final1[i] + i;
                }
            }
            for (int i = 0; i < n + 1; i++) {
                if(ans1[i] != 0 && ans1[i] <= n){
                    ans = n - final1[i];
                    break;
                }else if(ans1[i] != 0 && ans1[i] > n){
                    ans = -1;
                }
            }
            System.out.println(ans);
        }
    }
}
