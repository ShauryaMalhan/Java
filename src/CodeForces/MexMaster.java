package CodeForces;

import java.util.Scanner;

public class MexMaster {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-- > 0){
            int n = in.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = in.nextInt();
            }
            int sum1 = 0;
            int sum2 = 0;
            for (int i = 0; i < n; i++) {
                if(arr[i] == 0){
                    sum1++;
                } else if (arr[i] == 1) {
                    sum2++;
                }
            }
            if(sum1 == n){
                System.out.println(1);
            }else if(sum1 <= (n + 1) / 2) {
                System.out.println(0);
            }else if(sum1 + sum2 == n){
                System.out.println(2);
            }else{
                System.out.println(1);
            }
        }
    }
}