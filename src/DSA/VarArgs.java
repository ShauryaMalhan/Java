package DSA;

import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
        fun(1, 3, 5, 7, 89, 4, 556, 7, 56);
        multiple(1, 2, "shaurya", "seema");
    }
    static void multiple(int a, int b, String ...v){

    }
    static void fun(int ...v){
        System.out.println(Arrays.toString(v));
    }
}
