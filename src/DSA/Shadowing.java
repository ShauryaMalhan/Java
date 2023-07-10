package DSA;

public class Shadowing {
    static int x = 90;//this will be shadowed
    public static void main(String[] args) {
        System.out.println(x);
        int x = 40;//scope begins when value is initialised
        System.out.println(x);
        fun();
    }
    static void fun(){
        System.out.println(x);
    }
}
