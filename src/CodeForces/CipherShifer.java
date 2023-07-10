package CodeForces;

import java.util.Scanner;

public class CipherShifer {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-- > 0){
            int n = in.nextInt();
            String str = in.next();
            StringBuilder ans = new StringBuilder();
            int j = 1;
            char curr = str.charAt(0);
            while(j < n){
                if(str.charAt(j) == curr){
                    ans.append(curr);
                    if(j != n - 1){
                        curr = str.charAt(j + 1);
                        j = j + 1;
                    }
                }
                j++;
            }
            System.out.println(ans);
        }
    }
}