package CodeForces;

import java.util.Scanner;

public class WalkingMaster {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-- > 0){
            long a = in.nextInt();
            long b = in.nextInt();
            long a1 = in.nextInt();
            long b1 = in.nextInt();
            if(a < a1){
                long d = a1 - a;
                long y = b + d;
                long ans = b1 - y;
                if(ans >= 0){
                    System.out.println((2 * ans) + d);
                }else{
                    System.out.println(-1);
                }
            }else{
                if(b1 >= b){
                    long d = a - a1;
                    long ans = b1 - b;
                    System.out.println(d + (2 * ans));
                }else{
                    System.out.println(-1);
                }
            }
        }
    }
}
