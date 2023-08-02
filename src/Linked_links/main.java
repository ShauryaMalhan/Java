package Linked_links;

public class main {
    public static void main(String[] args) {
        LL lists = new LL();
        lists.insertFirst(3);
        lists.insertFirst(2);
        lists.insertFirst(8);
        lists.insertFirst(17);
        lists.insertLast(67);
        lists.insert(69, 3);
        lists.display();
    }
}
