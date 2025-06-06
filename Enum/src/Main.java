import java.util.EnumSet;

public class Main {
    public static Days getDay(){
        return Days.SATURDAY;
    }
    public static void main(String[] args) {
        Days[] days=Days.values();
//      Iterate over all values.....
        for(Days day:days){
            System.out.println("iterate over all values:::"+day.getDescription());
        }
        System.out.println("-----------------------------------");
        System.out.println("here is get day:"+getDay().ordinal());

// days range::
        for(Days day: EnumSet.range(Days.TUESDAY,Days.FRIDAY)){
            System.out.println("iterate over all values:::"+day.getDescription());
        }    }
}