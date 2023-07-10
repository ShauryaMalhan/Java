package CodeForces;

import java.util.Scanner;

public class ComparisonString1837B {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        int i = 0;
        while(i < T){
            int n = in.nextInt();
            String str = in.next();
            int sum = 1;
            int final1 = 1;
            int j = 0;
            char initial = '<';
            while(j < n - 1){
                initial = str.charAt(j);
                char next = str.charAt(j + 1);
                if(initial == next){
                    sum++;
                    final1 = Math.max(final1, sum);
                }else{
                    sum = 1;
                    initial = next;
                }
                j++;
            }
            i++;
            System.out.println(final1 + 1);
        }
    }
}
