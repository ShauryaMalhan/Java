package Linear_search;

import java.util.Arrays;

public class SearchinRange {
    public static void main(String[] args) {
        String name = "Shaurya";
        char target = 'u';
        boolean ans = search(name, target, 1, 4);
        System.out.println(ans);
        System.out.println(Arrays.toString(name.toCharArray())); // Important String to array
    }
    static boolean search(String str, char a, int start, int end){
        if(str.length() == 0){
            return false;
        }
        for (int i = start; i <= end; i++) {
            char element = str.charAt(i);
            if(element == a){
                return true;
            }
        }
        return false;
    }
}
