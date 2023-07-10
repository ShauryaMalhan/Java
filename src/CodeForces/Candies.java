package CodeForces;

import java.util.Scanner;

public class Candies {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {
            long n = in.nextInt();
            if (n % 2 == 0) {
                System.out.println(-1);
            }else if(Math.pow(2, 41) < n){
                System.out.println(-1);
            }
            else {
                int a = 0;
                for (int i = 1; i <= 41; i++) {
                    if (Math.pow(2, i) > n) {
                        a = i;
                        break;
                    }
                }
                StringBuilder obj = new StringBuilder();
                while (n > 0) {
                    if (n % 2 != 0) {
                        n = (n - 1) / 2;
                        obj.append('2');
                    } else {
                        n = n / 2;
                        obj.append('1');
                    }
                }
                System.out.println(a - 1);
                for (int i = a - 1; i > 0; i--) {
                    System.out.print(obj.charAt(i) + " ");
                }
                System.out.println();
            }
        }
    }
}