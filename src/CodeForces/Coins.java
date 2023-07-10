package CodeForces;

import java.util.Scanner;

public class Coins {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-- > 0){
            long n = in.nextLong();
            long k = in.nextLong();
            if(n == 1 && k != 1){
                System.out.println("no");
            }else if(n % 2 == 0){
                System.out.println("Yes");
            }else{
                if(n >= k  && k % 2 != 0){
                    System.out.println("yes");
                }else{
                    System.out.println("no");
                }
            }
        }
    }
}
