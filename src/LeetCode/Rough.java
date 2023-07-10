package LeetCode;

import java.util.Scanner;

public class Rough {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int dividend = in.nextInt();
        int divisor = in.nextInt();
        System.out.println(divide(dividend, divisor));
    }
    static int divide(int dividend, int divisor){
        int sum = 1;
        if(dividend > 0 && divisor > 0){
            while(divisor <= dividend){
                sum++;
                divisor += divisor;
            }
            return sum;
        }else if(dividend < 0 && divisor < 0){
            dividend = -dividend;
            divisor = -divisor;
            while(divisor <= dividend){
                sum++;
                divisor += divisor;
            }
            return sum;
        }else if(dividend > 0 && divisor < 0){
            divisor = -divisor;
            while(divisor <= dividend){
                sum++;
                divisor += divisor;
            }
            return -sum;
        }else if(dividend < 0 && divisor > 0){
            dividend = -dividend;
            while(divisor <= dividend){
                sum++;
                divisor += divisor;
            }
            return -sum;
        }if(dividend == 0){
            return 0;
        }
        return -1;
    }
}
