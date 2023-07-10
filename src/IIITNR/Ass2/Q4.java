package IIITNR.Ass2;

import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        String y = Integer.toString(num);
        System.out.println(num);
        for(int i = 0; i < y.length(); i++){
            replace(y.charAt(i));
        }
    }
    static void replace(char a){
        switch (a) {
            case '1' -> System.out.print("one ");
            case '2' -> System.out.print("two ");
            case '3' -> System.out.print("three ");
            case '4' -> System.out.print("four ");
            case '5' -> System.out.print("five ");
            case '6' -> System.out.print("six ");
            case '7' -> System.out.print("seven ");
            case '8' -> System.out.print("eight ");
            case '9' -> System.out.print("nine ");
        }
    }
}