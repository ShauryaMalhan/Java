package CodeForces;

import java.util.Scanner;

public class LuoTianyiandthePalindromeString {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0){
            String a = in.next();
            int ans = -1;
            for (int i = 0; i < a.length() / 2; i++) {
                if(a.charAt(i) != a.charAt(i + 1)){
                    ans = a.length() - 1;
                    break;
                }
            }
            System.out.println(ans);
        }
    }
}
