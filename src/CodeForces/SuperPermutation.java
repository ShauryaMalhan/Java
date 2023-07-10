package CodeForces;

import java.util.Scanner;

public class SuperPermutation {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-- > 0){
            int n = in.nextInt();
            if(n == 1){
                System.out.println(1);
            }else if(n % 2 != 0){
                System.out.println(-1);
            }else{
                int[] ans = new int[n];
                ans[0] = n;
                System.out.print(n + " ");
                for (int i = 1; i < n; i++) {
                    if(i % 2 == 0){
                        ans[i] = i;
                    }else{
                        ans[i] = n - i;
                    }
                    System.out.print(ans[i] + " ");
                }
                System.out.println();
            }
        }
    }
}