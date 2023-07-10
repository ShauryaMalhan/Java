package IIITNR;

import java.util.Scanner;

public class Lab4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        mathAssignment obj = new mathAssignment(a, b, c);
        System.out.println(obj.numbers(a, b));
        System.out.println(obj.numbers(a, b, c));
        System.out.println(obj.finalNumber(a, b ,c));
    }
}
class mathAssignment{
    int a;
    int b;
    int c;
    mathAssignment(int a, int b, int c){
        this.a = a;
        this.b = b;
        this.c = c;
    }
    String numbers(int a, int b){
        return "First Number: " + a + "+" + b + "i";
    }
    String numbers(int a, int b ,int c){
        return "Second Number: " + a + "+" + b + "i" + "+" + c + "=" + (a + c) + "+" + b + "i";
    }
    String finalNumber(int a, int b, int c){
        return "Final number: " + (2*a + c) + "+" + 2*b + "i";
    }
}