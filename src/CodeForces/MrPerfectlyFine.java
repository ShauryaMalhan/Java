package CodeForces;

import java.util.Scanner;

public class MrPerfectlyFine {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        while(T-- > 0){
            int sum10 = 0;
            int sum01 = 0;
            int sum11 = 0;
            int n = in.nextInt();
            for (int i = 0; i < n; i++) {
                int k = in.nextInt();
                String str = in.next();
                if(str.charAt(0) == '0' && str.charAt(1) == '1'){
                    if(sum01 == 0){
                        sum01 = k;
                    }else{
                        sum01 = Math.min(k, sum01);
                    }
                }else if(str.charAt(0) == '1' && str.charAt(1) == '0'){
                    if(sum10 == 0){
                        sum10 = k;
                    }else{
                        sum10 = Math.min(k, sum10);
                    }
                }else if(str.charAt(0) == '1' && str.charAt(1) == '1'){
                    if(sum11 == 0){
                        sum11 = k;
                    }else{
                        sum11 = Math.min(k, sum11);
                    }
                }
            }
            int sum = sum01 + sum10;
            if(sum01 == 0 && sum11 == 0 || sum10 == 0 && sum11 == 0){
                System.out.println(-1);
            } else if (sum11 != 0 && sum01 == 0 || sum11 != 0 && sum10 == 0) {
                System.out.println(sum11);
            } else if (sum11 ==0 && sum != 0){
                System.out.println(sum);
            } else {
                System.out.println(Math.min(sum11, sum));
            }
        }
    }
}