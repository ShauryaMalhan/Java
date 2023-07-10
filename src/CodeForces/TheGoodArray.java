package CodeForces;

import java.util.Scanner;

public class TheGoodArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-- > 0){
            int n = in.nextInt();
            int k = in.nextInt();
            if(k == 1) {
                System.out.println(n);
            }else {
                int ans = CeilDiv(n - 1, k);
                System.out.println(ans + 1);
            }
        }
    }
    static int CeilDiv(int a, int b){
        if(a % b == 0){
            return a / b;
        }else{
            return a / b + 1;
        }
    }
}
