package CodeForces;

import java.util.Arrays;
import java.util.Scanner;

public class LuckyNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-- > 0){
            int l = in.nextInt();
            int r = in.nextInt();
            int longest = 0;
            int ans = 0;
            for (int i = l; i <= r; i++) {
                String num = Integer.toString(i);
                char[] arr = num.toCharArray();
                Arrays.sort(arr);
                int max = arr[arr.length - 1] - arr[0];
                if(max >= longest){
                    longest = max;
                    ans = i;
                }
                if(longest == 9){
                    break;
                }
            }
            System.out.println(ans);
        }
    }
}
