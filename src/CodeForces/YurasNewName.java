package CodeForces;

import java.util.Scanner;

public class YurasNewName {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-- > 0){
            String a = in.next();
            int sum = 0;
            if(a.length() == 1){
                if(a.charAt(0) == '^'){
                    sum = 1;
                }else{
                    sum = 2;
                }
                System.out.println(sum);
            }else{
                for (int i = 0; i < a.length() - 1; i++) {
                    if(a.charAt(i) == '_' && a.charAt(i + 1) == '_'){
                        sum++;
                    }
                }
                if(a.charAt(0) == '_' && a.charAt(a.length() - 1) == '_'){
                    System.out.println(sum + 2);
                } else if (a.charAt(0) == '_') {
                    System.out.println(sum + 1);
                } else if (a.charAt(a.length() - 1) == '_') {
                    System.out.println(sum + 1);
                }else{
                    System.out.println(sum);
                }
            }
        }
    }
}
