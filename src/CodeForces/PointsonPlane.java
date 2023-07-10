package CodeForces;

import java.util.Scanner;

public class PointsonPlane {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-- > 0){
            long n = in.nextLong();
            long n1 = (long) Math.sqrt(n);
            while(n1 * n1 < n){
                n1++;
            }
            System.out.println(n1 - 1);
        }
    }
}
