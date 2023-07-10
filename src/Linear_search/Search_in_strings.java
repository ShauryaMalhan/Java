package Linear_search;

import java.util.Arrays;

public class Search_in_strings {
    public static void main(String[] args) {
        String name = "Shaurya";
        char target = 'u';
        boolean ans = search(name, target);
        System.out.println(ans);
        System.out.println(Arrays.toString(name.toCharArray())); // Important String to array
    }
    static boolean search(String str, char a){
        if(str.length() == 0){
            return false;
        }
        for (int i = 0; i < str.length(); i++) {
            char element = str.charAt(i);
            if(element == a){
                return true;
            }
        }
        return false;
    }
}