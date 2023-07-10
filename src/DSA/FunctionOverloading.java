package DSA;

public class FunctionOverloading {
    public static void main(String[] args) {
        // two functions or more of same name can exist together if the parameters are different
        fun(45);
        fun("Shaurya");
    }
    static void fun(int a){
        System.out.println(a);
    }
    static void fun(String name){
        System.out.println(name);
    }
}
