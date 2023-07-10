package Linear_search;

public class findMinNumber {
    public static void main(String[] args) {
        int[] arr = {18, 12, -7, 3, 14, 28};
        System.out.println(min(arr));
    }
    static int min(int[] str){
        if(str.length == 0){
            return -1;
        }
        int element = str[0];
        for (int i = 1; i < str.length; i++) {
            if(element > str[i]){
                element = str[i];
            }
        }
        return element;
    }
}
