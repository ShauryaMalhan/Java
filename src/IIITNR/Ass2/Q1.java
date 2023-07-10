package IIITNR.Ass2;
import java.util.Scanner;
public class Q1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Radius: ");
        int r = in.nextInt();
        System.out.print("Side: ");
        int s = in.nextInt();
        double area1 = (3.14*r*r);
        System.out.println(area1);
        int area2 = s*s;
        System.out.println(area2);
        if(area1 > area2){
            System.out.println("Centre 1");
        }
        else{
            System.out.println("Centre 2");
        }
    }
}