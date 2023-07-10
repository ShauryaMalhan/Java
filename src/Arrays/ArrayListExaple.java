package Arrays;

import java.util.ArrayList;

public class ArrayListExaple {
    public static void main(String[] args) {
        // Syntax
        ArrayList<Integer> list = new ArrayList<>(10);
        list.add(67);
        list.add(234);
        list.add(56);
        list.add(67);
        list.add(78);

        System.out.println(list);
        System.out.println(list.contains(567));
        list.set(0, 99);
        System.out.println(list);

        list.get(3); // pass the index list[index] does not work
    }
}
