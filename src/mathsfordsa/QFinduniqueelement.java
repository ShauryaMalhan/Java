package mathsfordsa;
//XOR follows assosiative property
//ans = XOR the whole array.
public class QFinduniqueelement {
    public static void main(String[] args) {
        int[] arr = {2, 3, 3, 4, 2, 6, 4};
        int ans = arr[0];
        for (int i = 1; i < arr.length; i++) {
            ans ^= arr[i];
        }
        System.out.println(ans);
    }
}