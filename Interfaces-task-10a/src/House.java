public class House implements CarbonFootPrintProducer{
    private double coveredArea;
    private final double CO2=0.005;

    public House(double coveredArea) {
        this.coveredArea = coveredArea;
    }

    @Override
    public double getCarbonFootPrint() {
        return getCO2()*getCoveredArea();
    }

    public double getCoveredArea() {
        return coveredArea;
    }

    public void setCoveredArea(double coveredArea) {
        this.coveredArea = coveredArea;
    }

    public double getCO2() {
        return CO2;
    }
}
