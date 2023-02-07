import Bike.Bike;
import Car.Car;
import Cycle.Cycle;
import Hatchback.Hatchback;
import Sedan.Sedan;
import Truck.Truck;
import Vehicle.Vehicle;

public class App {
    public static void main(String[] args) throws Exception {
        Vehicle vehicle1 = new Vehicle("BMW", "3 series", 4, 10);
        vehicle1.getVehicleInformation();
        System.out.println("*****************************");

        Car car1 = new Car("BMW", "3 series", 4, 10, true, "V9", "brrrrr");
        car1.getCarInformation();
        System.out.println("*****************************");

        Sedan sedan = new Sedan("Toyota", "Camry", 4, 10, true, "V5", "brrrrr", "Sedan");
        sedan.getCarInformation();
        System.out.println("*****************************");
                
        Hatchback hatchback = new Hatchback("Nissan", "Altima", 4, 5, false, "V3", "brrrrr", "Hatchback");
        hatchback.getCarInformation();
        System.out.println("*****************************");

        Bike bike = new Bike("Aventon", "Adventure", 2, 3, "30cc");
        bike.getBikeInformation();
        System.out.println("*****************************");
                
        Truck truck = new Truck("GMC", "Sierra 1500 Denali", 4,15,true, "close", true, "brrrrr", "V5");
        truck.getTruckInformation();
        System.out.println("*****************************");

        Cycle cycle = new Cycle("Indoor cycle", "5.0 IC", 0, 0);
        cycle.getCycleInformation();
    }
}
