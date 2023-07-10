package CodeForces;

import java.util.Scanner;

public class Likes {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-- > 0){
            int n = in.nextInt();
            int neg = 0;
            int pos = -1;
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = in.nextInt();
                if(arr[i] < 0){
                    neg++;
                }else{
                    pos++;
                }
            }
            int[] d = new int[n];
            int[] f = new int[n];
            d[0] = 1;
            f[0] = 1;
            int curr2 = 1;
            int curr = 1;
            for (int i = 1; i < n; i++) {
                if(d[i - 1] != 0 && neg > 0){
                    curr--;
                    neg--;
                }else{
                    curr++;
                }
                if(pos > 0){
                    pos--;
                    curr2++;
                }else{
                    curr2--;
                }
                f[i] = curr2;
                d[i] = curr;
            }
            for (int i = 0; i < n; i++) {
                System.out.print(f[i] + " ");
            }
            System.out.println();
            for (int i = 0; i < n; i++) {
                System.out.print(d[i] + " ");
            }
            System.out.println();
        }
    }
}
