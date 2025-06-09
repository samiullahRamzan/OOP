public class HourlyEmployee extends Employee {
    private double hour;
    private double wage;

    public HourlyEmployee(String firstName, String lastName, String CNIC, double hour, double wage) {
        super(firstName, lastName, CNIC);
        this.hour = hour;
        this.wage = wage;
    }

    public double earnings(){
        if (hour <= 40) {
            return wage * hour;
        } else {
            return (40 * wage) + ((hour - 40) * wage * 1.5);
        }
    }


    public double getHour() {
        return hour;
    }

    public void setHour(double hour) {
        if (hour >= 0 && hour <= 168) {
            this.hour = hour;
        } else {
            System.out.println("Hours should be between 0 and 168. Setting hours to 0.");
            this.hour = 0;
        }
    }

    public double getWage() {
        return wage;
    }

    public void setWage(double wage) {
        if(wage<0){
            System.out.println("wage should not be negative");
            return;
        }
        this.wage = wage;

    }

    public String toString(){
        return super.toString()+"wage:"+getWage()+"\n"+getHour()+"\n";
    }
}
