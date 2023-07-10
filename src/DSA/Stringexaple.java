package DSA;

import java.util.Scanner;

public class Stringexaple {
    public static void main(String[] args) {
        System.out.println(greet());
    }
    static String greet(){
        Scanner in = new Scanner(System.in);
        String greeting = in.nextLine();
        return greeting;
    }
}