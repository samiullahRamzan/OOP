import java.time.Year;

public class Date {
    private int day;
    private int month;
    private int year;

    public Date(int day, int month, int year) {
        setDay(day);
        setMonth(month);
        setYear(year);
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        if(day<=0){
            System.out.println("day cannot be zero or negative");
            return;
        }
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        if(month<=0){
            System.out.println("month cannot be zero or negative");
            return;
        }
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if(year<=0){
            System.out.println("year cannot be zero or negative");
            return;
        }
        this.year = year;
    }
}
