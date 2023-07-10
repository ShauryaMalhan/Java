package CodeForces;

import java.util.Scanner;

public class GamewithBoard {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-- > 0){
            int n = in.nextInt();
            if(n == 2 || n == 3 || n == 4){
                System.out.println("Bob");
            }else{
                System.out.println("Alice");
            }
        }
    }
}