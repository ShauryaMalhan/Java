package IIITNR.Ass2;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Arav Speed: ");
        int arav_speed = in.nextInt();
        System.out.print("Aaran Speed: ");
        int aaran_speed = in.nextInt();
        int speed = arav_speed - aaran_speed;
        System.out.println("Difference in speed: " + speed);
        if(speed < 0){
            System.out.println("Aaran had more speed");
        }
        else{
            System.out.println("Arav had more speed");
        }
    }
}