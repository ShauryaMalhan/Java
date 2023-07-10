package CodeForces;

import java.util.Scanner;

public class Matching {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-- > 0){
            String a = in.next();
            int sum = 0;
            for (int i = 0; i < a.length(); i++) {
                if(a.charAt(i) == '?'){
                    sum++;
                    }
                }
            if(a.length() == 1){
                if(a.charAt(0) == '0'){
                    System.out.println(0);
                }else if(a.charAt(0) == '?'){
                    System.out.println(9);
                }else{
                    System.out.println(1);
                }
            }else{
                if(a.charAt(0) == '?'){
                    System.out.println((int) (Math.pow(10, sum) - Math.pow(10, sum - 1)));
                }else if(a.charAt(0) == '0'){
                    System.out.println(0);
                }else{
                    System.out.println( (int) (Math.pow(10, sum)));
                }
            }
        }
    }
}