package IIITNR.Lab2;
import java.util.ArrayList;
import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int Total_Days = in.nextInt();
        ArrayList<Integer> meat_each_day = new ArrayList<>();
        ArrayList<Integer> cost_each_day = new ArrayList<>();
        for (int i = 0; i < Total_Days; i++) {
            int ai = in.nextInt();
            int pi = in.nextInt();
            meat_each_day.add(ai);
            cost_each_day.add(pi);
        }
        Total_Meat_Cost obj = new Total_Meat_Cost(Total_Days, meat_each_day, cost_each_day);
        obj.CalculateCost();
        System.out.println(obj.c);
    }
}
class Total_Meat_Cost{
    ArrayList<Integer> list1;
    ArrayList<Integer> list2;
    int c;
    int n;
    Total_Meat_Cost(int Total_Days, ArrayList<Integer> meat_each_day, ArrayList<Integer> cost_each_day){
        this.list1 = meat_each_day;
        this.list2 = cost_each_day;
        this.n = Total_Days;
    }
    void CalculateCost(){
        int k = 0;
        int j = 0;
        while(j < n) {
            if (list2.get(k) <= list2.get(j)) {
                c += list2.get(k) * list1.get(j);
            } else if (list2.get(j) < list2.get(k)) {
                k += list2.indexOf(list2.get(j));
                c += list2.get(k) * list1.get(j);
            }
            j++;
        }
    }
}