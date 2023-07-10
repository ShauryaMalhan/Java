package IIITNR;

import java.util.Scanner;

public class Designnotebook{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int length = in.nextInt();
        int breadth = in.nextInt();
        Designnotebook square = new Designnotebook(length);
        System.out.println("Display Measurements of Square: ");
        square.square();
        rectangle rectangle = new rectangle(length, breadth);
        System.out.println("Display Measurements of Rectangle: ");
        rectangle.rectanglearea();
    }
    int length;
    Designnotebook(int length){
        this.length = length;
    }
    void square(){
        int area = length * length;
        System.out.println("Area of square: " + area);
    }
}
class rectangle extends Designnotebook{
    int breadth;
    public rectangle(int length, int breadth){
        super(length);
        this.breadth = breadth;
    }
    void rectanglearea(){
        int area = length * breadth;
        System.out.println(area);
    }
}