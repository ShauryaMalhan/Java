package CodeForces;

import java.util.ArrayList;
import java.util.Scanner;

public class ContrastValue {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-- > 0){
            int n = in.nextInt();
            ArrayList<Integer> obj = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                obj.add(in.nextInt());
            }
            if(obj.size() == 1){
                System.out.println(1);
            }else{
                int state = 0;
                int c = 0;
                for (int i = 1; i < obj.size(); i++) {
                    if(obj.get(i) > obj.get(i - 1) && state != 1){
                        c++;
                        state = 1;
                    }else if(obj.get(i) < obj.get(i - 1) && state != -1){
                        c++;
                        state = -1;
                    }
                }
                System.out.println(c + 1);
            }
        }
    }
}