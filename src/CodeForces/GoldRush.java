package CodeForces;

import java.util.Scanner;

public class GoldRush {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        while(T-- > 0) {
            long k = in.nextLong();
            long b = in.nextLong();
            if(recurse(k, b)){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }
    }
    static Boolean recurse(long a, long m){
        if(a == m){
            return true;
        }else if(a < m || a % 3 != 0){
            return false;
        }
        return recurse(a / 3, m) || recurse(2*(a/3), m);
    }
}