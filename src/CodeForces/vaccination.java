package CodeForces;

import java.util.Scanner;

public class vaccination {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-- > 0){
            int n = in.nextInt();
            int k = in.nextInt();
            int d = in.nextInt();
            int w = in.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = in.nextInt();
            }
            int curr = -1;
            int count = 0;
            int dose = 0;
            for (int i = 0; i < n; i++) {
                if(arr[i] <= curr + d && count > 0){
                    count--;
                }else{
                    curr = arr[i] + w;
                    count = k - 1;
                    dose++;
                }
            }
            System.out.println(dose);
        }
    }
}