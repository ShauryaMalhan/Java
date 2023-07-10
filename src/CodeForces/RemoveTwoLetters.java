package CodeForces;

import java.util.Scanner;

public class RemoveTwoLetters {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-- > 0){
            int n = in.nextInt();
            String str = in.next();
            int a = 0;
            for (int i = 0; i < n - 2; i++) {
                if(str.charAt(i) == str.charAt(i + 2)){
                    a++;
                }
            }
            System.out.println(n - 1 - a);
        }
    }
}
