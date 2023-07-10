package DSA;

public class scope {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        {
            int c = 78;
            // Values that are initialised in this block will remain in this block
            a = 100; // Initialised outside the block so can be changed
        }
        System.out.println(a);
//        System.out.println(c);
    // Scoping in for loops
        for (int i = 0; i < 4; i++) {
            System.out.println(i);
        }
//        System.out.println(i);
    }
    static void swap(int num1, int num2){
        int temp = num1;
        num1 = num2;
        num2 = temp;

        // this change will only be valid in the function scope only
    }
}
