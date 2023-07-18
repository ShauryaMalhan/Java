package Recursion;

public class FibonacciNumbers {
    public static void main(String[] args) {
        // Find nth Fibonacci number
        System.out.println(fibo(6));
    }
    static int fibo(int n){
        // Base Condition
        if(n < 2){
            return n;
        }
        return fibo(n - 1) + fibo(n - 2);
    }
}
