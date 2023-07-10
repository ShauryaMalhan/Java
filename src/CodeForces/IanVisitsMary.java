package CodeForces;

import java.util.Scanner;

public class IanVisitsMary {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long t = in.nextInt();
        while(t-- > 0){
            long a = in.nextInt();
            long b = in.nextInt();
            if(a == 1 || b == 1){
                System.out.println(1);
                System.out.println(a + " " + b);
            }else {
                System.out.println(2);
                System.out.println((a - 1) + " " + (1));
                System.out.println(a + " " + b);
            }
        }
    }
}
