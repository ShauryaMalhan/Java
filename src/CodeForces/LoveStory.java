package CodeForces;

import java.util.Scanner;

public class LoveStory {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        while(T-- > 0){
            String a = "codeforces";
            String b = in.next();
            int i = 0;
            int j = 0;
            int sum = 0;
            while(i < 10){
                if(a.charAt(i) != b.charAt(j)){
                    sum++;
                }
                j++;
                i++;
            }
            System.out.println(sum);
        }
    }
}
