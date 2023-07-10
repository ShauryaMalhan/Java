package CodeForces;

import java.util.Scanner;

public class LameKing {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-- > 0){
            int a = Math.abs(in.nextInt());
            int b = Math.abs(in.nextInt());
            if(a == b || a + 1 == b || b + 1 == a){
                System.out.println(a + b);
            }else{
                int d = Math.max(a, b);
                System.out.println((2 * d) - 1);
            }
        }
    }
}
