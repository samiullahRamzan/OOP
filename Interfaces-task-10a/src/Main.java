import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    // This method calculates the total carbon footprint for all entities in the list
    public static double calculateTotalFootPrint(ArrayList<CarbonFootPrintProducer> entities){
        double totalCarbonFootPrint = 0;
        for (CarbonFootPrintProducer entity : entities) {
            totalCarbonFootPrint += entity.getCarbonFootPrint();
        }
        return totalCarbonFootPrint;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking user input for car and house details
        System.out.print("Enter miles driven by Car: ");
        double milesDriven = scanner.nextDouble();

        System.out.print("Enter covered area of House: ");
        double coveredArea = scanner.nextDouble();

        // Create House and Car objects with user input
        House house = new House(coveredArea);
        Car car = new Car(milesDriven);

        // Add the objects to the list
        ArrayList<CarbonFootPrintProducer> entities = new ArrayList<>();
        entities.add(house);
        entities.add(car);

        // Calculate the total carbon footprint
        double totalFootPrint = calculateTotalFootPrint(entities);

        // Display the total carbon footprint rounded to 2 decimal places
        System.out.printf("The total Carbon Foot Print is %.6f tone(s) of CO2%n", totalFootPrint);
    }
}
