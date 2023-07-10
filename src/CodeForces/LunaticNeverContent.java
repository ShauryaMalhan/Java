package CodeForces;

import java.util.ArrayList;
import java.util.Scanner;

public class LunaticNeverContent {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {
            int n = in.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = in.nextInt();
            }
            ArrayList<Integer> obj = new ArrayList<>();
            int mid = n / 2;
            for (int i = 0; i < mid; i++) {
                if(arr[i] !=  arr[n - i - 1]){
                    obj.add(arr[i] - arr[n - i - 1]);
                }
            }
            int ans = 0;
            for (int i = 0; i < obj.size(); i++) {
                ans = gcd(ans, obj.get(i));
            }
            System.out.println(Math.abs(ans));
        }
    }
    static int gcd(int a, int b){
        if(b == 0){
            return a;
        }
        return gcd(b, a % b);
    }
}