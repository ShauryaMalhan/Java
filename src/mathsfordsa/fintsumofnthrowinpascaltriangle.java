package mathsfordsa;

/*
 * PASCALS TRIANGLE
 * 1 1
 * 1 2 1
 * 1 3 3 1
 * 1 4 6 4 1
 * 1 5 10 10 5 1
 * nC0 + nC1 + nC2 + .... + nCn = 2^n
 * now sum of nth row = 2^(n-1);
 */
public class fintsumofnthrowinpascaltriangle {
    public static void main(String[] args) {
        // Lets say for fifth row
        int a = 4;
        int sum = 1;
        for (int i = 0; i < a; i++) {
            int d = 1 << i;
            sum += (d & (int) Math.pow(2, i));
        }
        System.out.println(sum);
    }
}
