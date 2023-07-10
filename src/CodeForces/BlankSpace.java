package CodeForces;

import java.util.Scanner;

public class BlankSpace {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        while(T-- > 0) {
            int n = in.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = in.nextInt();
            }
            int sum = 0;
            int longest = 0;
            for (int i = 0; i < n; i++) {
                if(arr[i] == 0){
                    sum++;
                    if(i == arr.length - 1){
                        longest = Math.max(longest, sum);
                    }
                }else{
                    longest = Math.max(longest, sum);
                    sum = 0;
                }
            }
            System.out.println(longest);
        }
    }
}
