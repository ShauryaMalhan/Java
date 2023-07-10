package IIITNR;

public class Shaurya {
    public static void main(String[] args) {
        truck obj = new truck(5, 6, 9);
        System.out.println(obj.tyre);
        obj.speed(570, 789);
    }
}
class truck extends car {
    int bus;

    public truck(int bus, int tyre, int shield) {
        super(tyre, shield);
        this.bus = bus;
    }
}

class car {
    int tyre;
    int shield;

    public car(int tyre, int shield) {
        this.tyre = tyre;
        this.shield = shield;
    }

    public void speed(int tyre, int shield) {
        if (tyre > shield) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}
