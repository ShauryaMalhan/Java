package CodeForces;

import java.util.Scanner;

public class FindandReplace {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-- > 0){
            int n = in.nextInt();
            String str = in.next();
            String ans = "Yes";
            if(n == 1){
                System.out.println("yes");
            }else{
                for (int i = 0; i < n; i++) {
                    for (int j = i + 1; j < n; j += 2) {
                        if(str.charAt(i) == str.charAt(j)){
                            ans = "no";
                            break;
                        }
                    }
                    if(ans.equals("no")){
                        break;
                    }
                }
                System.out.println(ans);
            }
        }
    }
}