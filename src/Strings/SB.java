package Strings;

public class SB {
    public static void main(String[] args) {
        //Does not need to make new objects every time
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < 26; i++) {
            char ch = (char) ('a' + i);
            builder.append(ch);
        }
        System.out.println(builder);
    }
}
