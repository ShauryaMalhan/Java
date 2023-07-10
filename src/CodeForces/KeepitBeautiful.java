package CodeForces;

import java.util.Scanner;

public class KeepitBeautiful{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0){
            int n = in.nextInt();
            long[] arr = new long[n];
            for (int i = 0; i < n; i++) {
                arr[i] = in.nextLong();
            }
            int[] ans = new int[n];
            ans[0] = 1;
            int b = 0;
            for (int i = 1; i < n; i++) {
                if(arr[i] >= arr[i - 1]){
                    ans[i] = 1;
                }else{
                    b = i - 1;
                    break;
                }
            }
            for (int i = b + 1; i < n; i++) {
                long curr = arr[b];
                if(arr[0] >= arr[i]){
                    ans[i] = 1;
                    b = i;
                    break;
                }else if(arr[i] >= curr){
                    b = i;
                    ans[i] = 1;
                }
            }
            for (int i = b + 1; i < n; i++) {
                long curr = arr[b];
                if(arr[i] >= curr && arr[i] <= arr[0]){
                    b = i;
                    ans[i] = 1;
                }
            }
            for (int i = 0; i < n; i++) {
                System.out.print(ans[i]);
            }
            System.out.println();
        }
    }
}
