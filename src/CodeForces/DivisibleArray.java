package CodeForces;

import java.util.Scanner;

public class DivisibleArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-- > 0){
            int n = in.nextInt();
            int[] arr = new int[n];
            if(n % 2 == 0){
                int k = 2;
                for (int i = 0; i < n; i++) {
                    arr[i] = k;
                    k += 2;
                }
            }else{
                int k = 1;
                for (int i = 0; i < n; i++) {
                    arr[i] = k;
                    k++;
                }
            }
            for (int i = 0; i < n; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
    }
}