public class AutomaticCar {
    private String model;
    private int year;
    private int speed;
    private int gear;
    private int odoMeter;

    public AutomaticCar(){

    }
    public AutomaticCar(String model, int year, int speed) {
        setModel(model);
        setYear(year);
        setSpeed(speed);
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if (year < 0) {
            System.out.println("year cannot be negative");
            return;
        }
        this.year = year;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        if (speed < 0) {
            System.out.println("Speed cannot be negative");
            return;  // Don't change speed or gear
        }
        this.speed = speed;
        updateGear();  // Update gear based on new speed
    }
    public int getGear() {
        return gear;
    }

    // Private method to update gear based on speed
    private void updateGear() {
        if (speed == 0) {
            gear = 0;
        } else if (speed <= 100) {
            gear = 1;
        } else if (speed <= 200) {
            gear = 2;
        } else if (speed <= 300) {
            gear = 3;
        } else if (speed <= 400) {
            gear = 4;
        } else if (speed <= 500) {
            gear = 5;
        } else {
            // If speed > 500, you might want to handle it
            // For example, set to highest gear or print a warning
            gear = 5;
            System.out.println("Speed exceeds max gear range, gear set to 5");
        }
    }

    public int getOdoMeter() {
        return odoMeter;
    }

    public void setOdoMeter(int odoMeter) {
        if(odoMeter<0){
            System.out.println("This value cannot be negative");
            return;
        }

        this.odoMeter +=odoMeter;
    }

//  hour is iteration
    public void calculateDistance(){
        setOdoMeter(speed);
    }

    public void printDistanceCover(int carNumber){
        System.out.println("Car " + carNumber + " (" + model + ") --: " + odoMeter + " KM Passed");
    }

}
