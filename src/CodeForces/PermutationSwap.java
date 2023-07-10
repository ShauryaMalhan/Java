package CodeForces;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class PermutationSwap {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {
            int n = in.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = in.nextInt();
            }
            int[] arr1 = Arrays.copyOf(arr, n);
            Arrays.sort(arr1);
            for (int i = 0; i < n; i++) {
                arr1[i] = Math.abs(arr[i] - arr1[i]);
            }
            ArrayList<Integer> final1 = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                if(arr1[i] != 0){
                    final1.add(arr1[i]);
                }
            }
            int longest = final1.get(0);
            for (int i = 0; i < final1.size() - 1; i++) {
                longest = gcd(longest, final1.get(i));
            }
            System.out.println(longest);
        }
    }
    public static int  gcd(int a,int b)
    {
        if(b==0)
            return a;
        return gcd(b,a%b);
    }
}