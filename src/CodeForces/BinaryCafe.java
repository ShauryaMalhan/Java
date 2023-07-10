package CodeForces;

import java.util.Scanner;

public class BinaryCafe {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-- > 0){
            int coins = in.nextInt();
            int n = in.nextInt();
            int m = (int)(Math.log(coins) / Math.log(2));
            if(m < n){
                System.out.println(coins + 1);
            }else{
                System.out.println((int)Math.pow(2, n));
            }
        }
    }
}
