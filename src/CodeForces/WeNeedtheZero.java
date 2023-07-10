package CodeForces;

import java.util.Scanner;

public class WeNeedtheZero {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-- > 0){
            int n = in.nextInt();
            int a = 0;
            for (int i = 0; i < n; i++) {
                a ^= in.nextInt();
            }
            if(n % 2 == 0){
                if(a == 0){
                    System.out.println(1);
                }else{
                    System.out.println(-1);
                }
            }else{
                System.out.println(a);
            }
        }
    }
}
