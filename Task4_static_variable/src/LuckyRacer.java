import java.util.ArrayList;
import java.util.Random;

public class LuckyRacer {
    public static void main(String[] args) {

        AutomaticCar car1=new AutomaticCar("HondaCity",2012,30);
        AutomaticCar car2=new AutomaticCar("BMW",2023,60);
        AutomaticCar car3=new AutomaticCar("Hyandei",2010,300);
        AutomaticCar car4=new AutomaticCar("HondaCivic",2018,200);
        AutomaticCar car5=new AutomaticCar("Prius",2020,100);

        ArrayList<AutomaticCar> cars=new ArrayList<>();
        cars.add(car1);
        cars.add(car2);
        cars.add(car3);
        cars.add(car4);
        cars.add(car5);

        Random random=new Random();
        int maxSpeed=500;

//      10 hour  each round 1 hour
        for(int i=0;i<10;i++){
            int hour = i + 1;

            for(AutomaticCar car:cars){
                car.setSpeed(random.nextInt(maxSpeed));
                car.calculateDistance();
            }

            System.out.println("After "+hour+" hour/s:");
            for (int j = 0; j < cars.size(); j++) {
                AutomaticCar car = cars.get(j);
                car.printDistanceCover(j+1);
            }
            System.out.println("------------------------------------------");

        }

        int maximumSpeed=cars.get(0).getOdoMeter();
        int index=0;
        for(int i=1;i<cars.size();i++){
            if(maximumSpeed<cars.get(i).getOdoMeter()){
                maximumSpeed=cars.get(i).getOdoMeter();
                index=i;
            }
        }

        AutomaticCar winingCar=cars.get(index);

        System.out.println("Congratulations!");
        System.out.println("Car"+(index+1)+", "+winingCar.getModel()+" won the race");
        System.out.println("Gear of wining car: "+winingCar.getGear());

    }
}