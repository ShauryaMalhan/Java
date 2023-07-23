package mathsfordsa;

public class factors {
    public static void main(String[] args) {
        int n = 20;
        factors1(n);
        System.out.println();
        factors2(n);
    }
    static void factors1(int n){
        for (int i = 1; i <= n; i++) {
            if(n % i == 0){
                System.out.print(i + " ");
            }
        }
    }
    static void factors2(int n){
        for (int i = 1; i <= Math.sqrt(n); i++) {
            if(n % i == 0){
                if(n / i == i){
                    System.out.print(i + " ");
                }else{
                    System.out.print(i + " " + n / i + " ");
                }
            }
        }
    }
}