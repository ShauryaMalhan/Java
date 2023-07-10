package IIITNR.Ass2;

import java.util.Scanner;
public class Q3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Brother 1: ");
        int brother_1 = in.nextInt();
        System.out.print("Brother 2: ");
        int brother_2 = in.nextInt();
        System.out.print("Brother 3: ");
        int brother_3 = in.nextInt();
        if(brother_1 > brother_2 && brother_1 > brother_3){
            System.out.println("Brother 1");
        }
        else if(brother_2 > brother_1 && brother_2 > brother_3){
            System.out.println("Brother 2");
        }
        else if(brother_3 > brother_1 && brother_3 > brother_2){
            System.out.println("brother 3");
        }
    }
}
