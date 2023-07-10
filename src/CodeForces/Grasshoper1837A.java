package CodeForces;

import java.util.Scanner;

public class Grasshoper1837A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        int i = 0;
        while(i < T) {
            int x = in.nextInt();
            int k = in.nextInt();
            int j = x;
            int sum = 1;
            int d;
            if(x > 0){
                while (j >= 0) {
                    if (j % k != 0) {
                        System.out.println(sum);
                        d = x - j;
                        if (d % 2 == 0) {
                            System.out.println(j);
                        } else {
                            System.out.println(j + " " + d);
                        }
                        break;
                    } else {
                        sum++;
                    }
                    j--;
                }
            }
            else{
                while (j <= 0) {
                    if (j % k != 0) {
                        System.out.println(sum);
                        d = x - j;
                        if (d % 2 == 0) {
                            System.out.println(j);
                        } else {
                            System.out.println(j + " " + d);
                        }
                        break;
                    } else {
                        sum++;
                    }
                    j++;
                }
            }
            i++;
        }
    }
}
