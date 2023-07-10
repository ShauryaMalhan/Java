package IIITNR.Lab3;

import java.util.Scanner;

public class Ram {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Distance Covered in Day 1: ");
        int d1 = in.nextInt();
        System.out.print("Distance Covered in Day 2: ");
        int d2 = in.nextInt();
        System.out.print("Distance Covered in Day 3: ");
        int d3 = in.nextInt();
        System.out.print("Distance Covered in Day 4: ");
        int d4 = in.nextInt();
        System.out.print("Distance Covered in Day 5: ");
        int d5 = in.nextInt();
        distanceRam obj = new distanceRam(d1, d2, d3, d4, d5);
        System.out.print("Result: ");
        System.out.println(obj.Gold());
    }
}
class distanceRam{
    int d1;
    int d2;
    int d3;
    int d4;
    int d5;
    distanceRam(int d1, int d2,int d3, int d4, int d5){
        this.d1 = d1;
        this.d2 = d2;
        this.d3 = d3;
        this.d4 = d4;
        this.d5 = d5;
    }
    int distance(int d1 , int d2){
        return d1 + d2;
    }
    int distance(int d3, int d4, int d5){
        return d3 + d4 + d5;
    }
    String Gold(){
        int two_days = distance(d1, d2);
        int three_days = distance(d3, d4, d5);
        if(two_days > three_days){
            return "GOLD";
        }
        else{
            return "NO";
        }
    }
}