package CodeForces;

import java.util.*;

public class WeWereBothChildren {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-- > 0){
            int n = in.nextInt();
            int[] obj = new int[n];
            for (int i = 0; i < n; i++) {
                obj[i] = in.nextInt();
            }
            int[] arr = new int[n + 1];
            for (int i = 0; i < n; i++) {
                if(obj[i] <= n){
                    arr[obj[i]]++;
                }
            }
            int[] arr2 = new int[n + 1];
            for (int i = 1; i <= n; i++) {
                for (int j = i; j <= n; j += i) {
                    arr2[j] += arr[i];
                }
            }
            Arrays.sort(arr2);
            System.out.println(arr2[arr2.length - 1]);
        }
    }
}
