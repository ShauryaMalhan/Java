package mathsfordsa;
// ans = ith bit & 1
// Now in order to this we will create a mask
public class QFindithbitofanumber {
    public static void main(String[] args) {
        int a = 59;
        int d = 2;
        System.out.println(a & (1 << (d - 1)));
    }
}