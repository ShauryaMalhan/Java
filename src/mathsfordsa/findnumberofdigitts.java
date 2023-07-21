package mathsfordsa;
// Use log
public class findnumberofdigitts {
    public static void main(String[] args) {
        int a = 356789;
        System.out.println((int) (Math.log(a) / Math.log(10) + 1));
    }
}
