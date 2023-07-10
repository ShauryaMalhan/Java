package CodeForces;

import java.util.Scanner;

public class BlackboardList {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-- > 0){
            int n = in.nextInt();
            long[] arr = new long[n];
            long min = Integer.MIN_VALUE;
            for (int i = 0; i < n; i++) {
                arr[i] = in.nextLong();
            }
            for (int i = 0; i < n; i++) {
                if(arr[i] < 0){
                    min = arr[i];
                    break;
                }else{
                    min = Math.max(min, arr[i]);
                }
            }
            System.out.println(min);
        }
    }
}
