public class Car implements CarbonFootPrintProducer {
    private double milesDriven;
    private final double CO2=0.0000292;

    public Car(double milesDriven) {
        this.milesDriven = milesDriven;
    }

    @Override
    public double getCarbonFootPrint() {
        return getMilesDriven()*getCO2();
    }

    public double getMilesDriven() {
        return milesDriven;
    }

    public void setMilesDriven(double milesDriven) {
        this.milesDriven = milesDriven;
    }

    public double getCO2() {
        return CO2;
    }
}
