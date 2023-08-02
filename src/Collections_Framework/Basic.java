package Collections_Framework;

public class Basic {
    enum Week{
        Monday, Tuesday, Wednesday, Thuresday, Friday, Saturday, Sunday;
        //These are enum constants
        //These are finals
        //type is week

        Week(){
            System.out.println("Cunstroctor called for " + this);
        }
        //This is not public or protected so only private or default
    }
    public static void main(String[] args) {
        Week week;
        week = Week.Monday;
        System.out.println(week.valueOf("Monday"));
        // for(Week day : Week.values()){
        //     System.out.println(day);
        // }
    }
}
