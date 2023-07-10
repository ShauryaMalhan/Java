package DSA;

import java.util.Scanner;

public class Functions {
    public static void main(String[] args) {
//        sum();
//        System.out.println(sum2());
        System.out.println(sum3(5, 5));
    }
    static int sum3(int a, int b){
        int sum = a + b;
        return sum;
    }
    static int sum2(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number 1: ");
        int num1 = input.nextInt();
        System.out.println("Enter number 2: ");
        int num2 = input.nextInt();
        int sum = num1 + num2;
        return sum;
    }
    static void sum(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number 1: ");
        int num1 = input.nextInt();
        System.out.println("Enter number 2: ");
        int num2 = input.nextInt();
        int sum = num1 + num2;
        System.out.println("Sum of 2 numbers: " + sum);
    }
}