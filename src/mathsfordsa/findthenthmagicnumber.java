package mathsfordsa;

public class findthenthmagicnumber {
    public static void main(String[] args) {
        // first convert it into bit then multiply it with 5 to the power of place of bit.
        int n = 6;
        int ans = 0;
        int base = 5;
        while(n > 0){
            int last = n & 1;
            n = n >> 1;
            ans += last * base;
            base = base * 5;
        }
        System.out.println(ans);
    }
}
